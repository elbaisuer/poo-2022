package com.agenda.dominio;

import java.security.PublicKey;

public class Persona {
    public String nombre;
    public String apellido;
    public String sexo;
    public long edad;

    public Persona(String nombre, String apellido, String sexo, long edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;

    }
}
