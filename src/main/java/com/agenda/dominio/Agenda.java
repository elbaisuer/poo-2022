package com.agenda.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Agenda {
    public List<Persona> personas;

    public Agenda() {
        this.personas = new ArrayList<>();
    }

   public void agregar(String nombre, String apellido, String sexo, long edad) {
        Persona personaAAgregar = new Persona(nombre, apellido, sexo, edad);
        this.personas.add(personaAAgregar);
    }

    public void eliminar(Persona personaAEliminar) {
        boolean eliminoCorrectamente = this.personas.remove(personaAEliminar);

        if (eliminoCorrectamente) {
            System.out.println("Se eliminó a " + personaAEliminar.nombre);
        } else {
            System.out.println("No se eliminó nada. Porque " + personaAEliminar.nombre + " no existe.");
        }
    }

    public void editar(Persona personaAEditar) {
        Persona c = buscarPersona(personaAEditar.nombre);

        if(c != null) {
            int posicionAReemplazar = this.personas.indexOf(c);
            this.personas.set(posicionAReemplazar, personaAEditar);
        } else {
            System.out.println("La persona a editar no existe.");
        }
    }

    public Persona buscarPersona(String nombre) {
        return this.personas.stream()
                .filter(persona -> persona.nombre.equals(nombre))
                .findFirst().orElse(null);
    }

    public List<Persona> buscarMayorDeEdad() {
        List<Persona> personasBuscadas = new ArrayList<>();
        for(Persona persona: this.personas){
            if (persona.edad>=18){
                personasBuscadas.add(persona);
            }
        }
        return personasBuscadas;
    }

    public List<Persona> buscarConSexo(String sexo) {
        List<Persona> personasBuscadas = new ArrayList<>();
        for(Persona persona: this.personas){
            if (persona.sexo.equals(sexo)){
                personasBuscadas.add(persona);
            }
        }
        return personasBuscadas;
    }

    public void imprimirAgenda() {
        this.personas.forEach(c -> System.out.println(c.nombre + " - " + c.edad));
    }
}
