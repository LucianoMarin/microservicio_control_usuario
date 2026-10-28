package com.microservicio.controlusuario.services;

import com.microservicio.controlusuario.models.Usuario;

import com.microservicio.controlusuario.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

/* CLASE SERVICE USUARIO */

public class UsuarioServiceImp implements UsuarioService {



    /* SE LLAMA EL OBJETO USUARIOREPOSITORY, PARA TRABAJAR CON JPAREPOSITORY */
    
    @Autowired
    private UsuarioRepository usuarioRepository;



    
    /* CREAR USUARIO EN LA TABLA USUARIO */
    @Override
    public Usuario crearUsuario(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }


    /* ELIMINAR ELEMENTO DE LA TABLA USUARIO */

    @Override
    public void eliminarUsuario(Long id) {

        usuarioRepository.deleteById(id);
    }


    /* EDITAR USUARIO DE LA TABLA USUARIO */

    @Override
    public Usuario editarUsuario(Long id, Usuario usuario) {

        Usuario encontrado = usuarioRepository.findById(id).orElseThrow();

        if (usuario.getUsuario() != null && usuario.getUsuario().isBlank()) {

            encontrado.setUsuario(usuario.getUsuario());

        }

        if (usuario.getClave() != null && usuario.getClave().isBlank()) {

            encontrado.setClave(usuario.getClave());

        }

        if (usuario.getRol() != null) {
            
            encontrado.setRol(usuario.getRol());
        
        }

        if(usuario.getIntento()!=null){

            encontrado.setIntento(usuario.getIntento());

        }




        return usuarioRepository.save(encontrado);

    }


    /* MOSTRAR TODOS LOS USUARIOS DE TABLA USUARIO */

    @Override
    public List<Usuario> mostrarUsuarios() {

        return usuarioRepository.findAll();

    }


    /* OBTENER UN USUARIO DE LA TABLA USUARIO */

    @Override
    public Usuario obtenerUsuario(Long id) {

        return usuarioRepository.findById(id).orElseThrow();
    }

}
