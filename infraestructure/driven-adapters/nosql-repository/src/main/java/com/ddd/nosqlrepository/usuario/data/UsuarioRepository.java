package com.ddd.nosqlrepository.usuario.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UsuarioRepository extends ReactiveCrudRepository<UsuarioDTO, String> {

}
