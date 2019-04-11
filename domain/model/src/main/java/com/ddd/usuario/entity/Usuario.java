package com.ddd.usuario.entity;

import lombok.*;

@Getter
@Builder(toBuilder = true)
public class Usuario {

    private final String id;
    private final String nombre;
    private final String edad;
    private final String celular;

}
