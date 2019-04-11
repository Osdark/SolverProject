package com.ddd.nosqlrepository.usuario.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Usuario")
public class UsuarioDTO {

    @Id
    private String id;
    private String nombre;
    private String edad;
    private String celular;

}
