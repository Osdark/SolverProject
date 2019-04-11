package com.ddd.usuario.entity;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String id;
    private String nombre;
    private String edad;
    private String celular;

}
