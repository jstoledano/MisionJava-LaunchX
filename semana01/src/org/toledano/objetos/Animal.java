package org.toledano.objetos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Animal extends Juguete{
    private String nombre;
    private String especie;

    public Animal(String nombre, String figura) {
        super(figura);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return especie + " {" + "nombre='" + nombre + '\'' + '}';
    }
}
