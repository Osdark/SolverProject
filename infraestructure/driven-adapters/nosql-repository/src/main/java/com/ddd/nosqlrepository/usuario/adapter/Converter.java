package com.ddd.nosqlrepository.usuario.adapter;

import com.ddd.generic.ObjectMapperDomain;
import com.ddd.mapper.ObjectMapper;
import com.ddd.nosqlrepository.usuario.data.UsuarioDTO;
import com.ddd.usuario.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter implements ObjectMapperDomain{

    @Autowired
    private ObjectMapper mapper;

    public UsuarioDTO toData(Usuario usuario){
        return mapper.map(usuario, UsuarioDTO.class);
    }

    public Usuario toEntity(UsuarioDTO usuarioDTO){
        return mapper.mapBuilder(usuarioDTO, Usuario.class);
    }

}
