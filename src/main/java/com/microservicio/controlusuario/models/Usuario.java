package com.microservicio.controlusuario.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity 
@Getter 
@Setter 
public class Usuario{



    @Column (name="id")
    private Long id;
    
    @Column (name="usuario")
    private String usuario;

    @Column (name="clave")
    private String clave;

    @Column (name="intento")
    private Integer intento;

    @Column (name="rol")
    private Integer rol;

    

    public Usuario(){}


    public Usuario(Long id,String usuario, Integer intento, Integer rol){

        this.id=id;
        this.usuario=usuario;
        this.intento=intento;
        this.rol=rol;

    }


}