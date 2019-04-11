package com.ddd.configuration;

import com.ddd.usuario.UsuarioUseCase;
import com.ddd.usuario.gateway.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public UsuarioUseCase usuarioUseCase(UsuarioRepository usuarioRepository){
        return new UsuarioUseCase(usuarioRepository);
    }

}
