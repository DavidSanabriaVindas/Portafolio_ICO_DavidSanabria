package Portafolio.Portafolio.service;

import org.springframework.security.core.userdetails.*;

public interface UsuarioDetailsService {
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
