package com.ddd.nosqlrepository.usuario.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Document(collection = "Usuario")
public class UsuarioDTO {

    private String id;
    private String nombre;
    private String edad;
    private String celular;

}
