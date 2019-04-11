package com.ddd.reactiveweb;

import com.ddd.usuario.UsuarioUseCase;
import com.ddd.usuario.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("blog")
@CrossOrigin(value = "*", allowCredentials = "true")
public class UsuarioController {

    @Autowired
    private UsuarioUseCase usuarioUseCase;

    @GetMapping()
    public Flux<Usuario> getUsuarios() {
        return usuarioUseCase.consultarUsuarios();
    }

//    @GetMapping()
//    public Mono<String> getMessage() {
//        return Mono.just("Holaaa");
//
//    }

}
