package org.experis.animals;

public class Main {
    public static void main(String[] args) {
        Animale[] animales = {new Aquila("Regina"), new Cane("lochi"), new Delfino("Samantha"), new Passerotto("Fresco")};
        for (Animale animale:animales) {
            System.out.println("------------------------------");
            System.out.println(animale + " " + animale.getName());
            animale.mangia();
            animale.verso();
            animale.dormi();


            System.out.println("------------------------------");


        }


    }
}


