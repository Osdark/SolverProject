package com.ddd.configuration;

import com.ddd.mapper.ObjectMapper;
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

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper() {
            @Override
            public <T> T map(Object src, Class<T> target) {
                return null;
            }

            @Override
            public <T> T mapBuilder(Object src, Class<T> target) {
                return null;
            }
        };
    }

}
