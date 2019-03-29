package br.com.posestacio.agenda.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.posestacio.agenda.model.Authority;
import br.com.posestacio.agenda.model.User;
import br.com.posestacio.agenda.repository.UserRepository;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username)
								.map(user 
										-> new org.springframework.security.core.userdetails.User(
												user.getUsername(), user.getPassword(), getGrantedAuthorities(user)))
								.orElseThrow(() 
										-> new UsernameNotFoundException("User "+username+" Not found"));
	}
	
	private Collection<GrantedAuthority> getGrantedAuthorities(User user){
    	Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority : user.getAuthorities()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getName());
            grantedAuthorities.add(grantedAuthority);
        }
        
        return grantedAuthorities;
    }
	
}
