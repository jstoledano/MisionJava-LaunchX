package org.toledano.objetos;

public class HuevoKinder {
    public static void main(String[] args) {
        Animal gorila = new Animal("Copo de nieve", "Gorila");
        gorila.setEspecie("Primate");
        gorila.setColeccion("Selva");
        gorila.setTemporada(2022);
        gorila.setId("001");
        gorila.setPiezas(5);
        gorila.setEnsamblado(false);

        System.out.println(gorila);
        System.out.println("El jueguete " + gorila.getNombre() +
                " es un " + gorila.getEspecie() +
                " tipo " + gorila.getFigura() +
                " de la colección " + gorila.getColeccion() +
                " temporada " + gorila.getTemporada()
        );
        System.out.println("Consta de " + gorila.getPiezas() + " piezas.");
        gorila.ensamblar();
    }
}
