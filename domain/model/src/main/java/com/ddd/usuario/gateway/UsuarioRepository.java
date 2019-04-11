package com.ddd.usuario.gateway;

import com.ddd.usuario.entity.Usuario;
import reactor.core.publisher.Flux;

public interface UsuarioRepository {

    Flux<Usuario> consultarUsuarios();

}
