package com.ddd.usuario;

import com.ddd.usuario.entity.Usuario;
import com.ddd.usuario.gateway.UsuarioRepository;
import reactor.core.publisher.Flux;

public class UsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public UsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Flux<Usuario> consultarUsuarios(){
        return usuarioRepository.consultarUsuarios();
    }

}
