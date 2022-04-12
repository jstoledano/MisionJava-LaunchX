package org.toledano.objetos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Juguete {
    private String figura, coleccion, id;
    private int piezas, temporada;
    private boolean ensamblado;

    Juguete(String figura) {
        this.figura = figura;
    }

    public void ensamblar() {
        if (!ensamblado) {
            if (piezas > 1) {
                System.out.println("El juguete ha sido ensamblado");
                ensamblado = true;
            } else
                System.out.println("El juguete no se puede ensamblar porque es una sola pieza");
        }
        else
            System.out.println("El juguete ya estaba ensamblado");
    }

    public String getInfo() {
        return "\nFigura: "+figura+
                "\nPiezas: "+piezas;
    }

    public String toString() {
        return "\nFigura: " + figura +
                "\nPiezas: " + piezas +
                coleccion;
    }

}

