package com.ddd.nosqlrepository.usuario.adapter;

import com.ddd.usuario.entity.Usuario;
import com.ddd.usuario.gateway.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class UsuarioRepositoryAdapter implements UsuarioRepository {

    @Autowired
    private com.ddd.nosqlrepository.usuario.data.UsuarioRepository usuarioRepository;

    @Autowired
    private Converter converter;

    @Override
    public Flux<Usuario> consultarUsuarios() {
        return usuarioRepository.findAll()
                .map(converter::toEntity);
    }
}
