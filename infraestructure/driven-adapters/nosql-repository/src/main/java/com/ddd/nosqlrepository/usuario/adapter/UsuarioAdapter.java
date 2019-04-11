package com.ddd.nosqlrepository.usuario.adapter;

import com.ddd.usuario.entity.Usuario;
import com.ddd.usuario.gateway.UsuarioRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class UsuarioAdapter implements UsuarioRepository {
    @Override
    public Flux<Usuario> consultarUsuarios() {
        return null;
    }
}
