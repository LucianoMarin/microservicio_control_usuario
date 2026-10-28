package com.microservicio.controlusuario.services;

import java.util.List;

import com.microservicio.controlusuario.models.Usuario;



/* INTERFACE DE USUARIO SERVICE */

public interface UsuarioService {



    /* PLANTILLA DEL CRUD DE USUARIO */

    Usuario crearUsuario(Usuario usuario);

    void eliminarUsuario(Long id);

    Usuario editarUsuario(Long id, Usuario usuario);

    List <Usuario> mostrarUsuarios();

    Usuario obtenerUsuario(Long id);




    
}
