package com.ddd.reactiveweb;

import com.ddd.usuario.UsuarioUseCase;
import com.ddd.usuario.entity.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("blog")
//@CrossOrigin(value = "*", allowCredentials = "true")
public class UsuarioController {

    private UsuarioUseCase usuarioUseCase;

    /*@GetMapping()
    public Flux<Usuario> getUsuarios() {
        return usuarioUseCase.consultarUsuarios();
    }*/

    @GetMapping()
    public String getMessage(){
        return "Holaaa";
    }

}
