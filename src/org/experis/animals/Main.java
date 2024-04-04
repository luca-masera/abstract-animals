package org.experis.animals;

public class Main {
    public static void main(String[] args) {
        Animale[] animales = {new Aquila(), new Cane(), new Delfino(), new Passerotto()};
        for (Animale animale:animales) {
            System.out.println("------------------------------");

            animale.mangia();
            animale.verso();
            animale.dormi();

            System.out.println("------------------------------");

            System.out.println(animale);
        }
    }
}

