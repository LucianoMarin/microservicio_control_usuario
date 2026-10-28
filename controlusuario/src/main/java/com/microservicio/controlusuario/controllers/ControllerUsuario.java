package com.microservicio.controlusuario.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.microservicio.controlusuario.models.Usuario;
import com.microservicio.controlusuario.services.UsuarioService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
@RequestMapping ("/usuarios")
@CrossOrigin ("*")

public class ControllerUsuario {


    
    
    @Autowired 
    private UsuarioService usuarioService;




    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){

        return usuarioService.crearUsuario(usuario);

    }


    @DeleteMapping ("/{id}")
    public void eliminarUsuario(@PathVariable Long id){

        usuarioService.eliminarUsuario(id);

    }


    @PutMapping ("/{id}")
    public Usuario actualizUsuario(@PathVariable Long id, @RequestBody Usuario usuario){

        return usuarioService.editarUsuario(id, usuario);

    }



    @GetMapping 
    public List <Usuario> mostrarUsuario(){

        return usuarioService.mostrarUsuarios();

    }


    @GetMapping ("/{id}")

    public Usuario obtenerUsuario(@PathVariable Long id){

        return usuarioService.obtenerUsuario(id);
    }



    


    
}
