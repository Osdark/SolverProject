package com.ddd.nosqlrepository.usuario.data;

import com.ddd.nosqlrepository.usuario.data.UsuarioDTO;
import com.ddd.usuario.entity.Usuario;
import com.ddd.usuario.gateway.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

public interface UsuarioDataRepository extends ReactiveCrudRepository<UsuarioDTO, String> {

}
