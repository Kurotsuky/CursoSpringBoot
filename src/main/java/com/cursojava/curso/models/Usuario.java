package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellido")
    private String apellido;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @Getter @Setter @Column(name = "password")
    private String password;


    public Usuario() {
        this(0L, null, null, null, null, null);
    }

    public Usuario(String nombre, String apellido, String email, String telefono) {
        this(0L, nombre, apellido, email, telefono, null);
    }

    public Usuario(Long id, String nombre, String apellido, String email, String telefono) {
        this(id, nombre, apellido, email, telefono, null);
    }

    public Usuario(String nombre, String apellido, String email, String telefono, String password) {
        this(0L, nombre, apellido, email, telefono, password);
    }

    public Usuario(Long id, String nombre, String apellido, String email, String telefono, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
    }
}
