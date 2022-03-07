package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Persona;

import java.util.List;

public class AppEPS {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregar("Felipe", "Rico", "Masculino", 23L);
        agenda.agregar("Simon", "Gomez", "Masculino", 23L);
        agenda.agregar("Mattius", "Cardona", "Masculino", 24L);
        agenda.agregar("Jose", "Jaramillo", "Masculino", 22L);
        agenda.agregar("Juan", "Fabioz", "Masculino", 13L);
        agenda.agregar("Fabiola", "Fabioz", "Femenino", 19L);

        agenda.imprimirAgenda();
        Persona c = agenda.buscarPersona("Felipe");
        List<Persona> mujeres = agenda.buscarConSexo("Femenino");
        List<Persona> hombres = agenda.buscarConSexo("Masculino");
        List<Persona> mayoresEdad = agenda.buscarMayorDeEdad();


        if (c != null) {
            System.out.println("Persona buscada: " + c.nombre);
        } else {
            System.out.println("Persona no encontrada");
        }
        if (mujeres.size()>0){
            System.out.println("Las mujeres registradas en la EPS son: " );
            for(Persona persona: mujeres){
                System.out.println("- " + persona.nombre + " " + persona.apellido);
            }
        }else {
            System.out.println("No hay mujeres registradas en la EPS");
        }
        if (hombres.size()>0){
            System.out.println("Los hombres registradas en la EPS son: " );
            for(Persona persona: hombres){
                System.out.println("- " + persona.nombre + " " + persona.apellido);
            }
        }else {
            System.out.println("No hay hombres registrados en la EPS");
        }
        if (mayoresEdad.size()>0){
            System.out.println("Los mayores de edad registrados en la EPS son: " );
            for(Persona persona: mayoresEdad){
                System.out.println("- " + persona.nombre + " " + persona.apellido);
            }
        }else {
            System.out.println("No hay mayores de edad registrados en la EPS");
        }
    }
}
