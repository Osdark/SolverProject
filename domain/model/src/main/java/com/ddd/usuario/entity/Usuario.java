package com.ddd.usuario.entity;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private String id;
    private String nombre;
    private String edad;
    private String celular;

}
