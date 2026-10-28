package com.microservicio.controlusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.controlusuario.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}


