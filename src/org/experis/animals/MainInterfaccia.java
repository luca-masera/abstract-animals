package org.experis.animals;

public class MainInterfaccia {

    public static void faiVolare (AnimaleVolante Animale ){
        Animale.vola();
    }
    public static void faiNuotare (AnimaleNuotante Animale ){

        Animale.nuota();
    }

    public static void main(String[] args) {

        Animale[] animales = {new Aquila("Jolly"), new Cane("Bingo"), new Delfino("Dolphin"), new Passerotto("Rosso")};

        for (Animale animale:animales) {
            if (animale instanceof AnimaleNuotante){
                System.out.println(animale + " " + animale.getName());
                faiNuotare((AnimaleNuotante) animale);
                System.out.println("--------------------");
            }
            if (animale instanceof AnimaleVolante){
                System.out.println(animale + " " + animale.getName());
                faiVolare((AnimaleVolante) animale);
                System.out.println("--------------------");
            }
        }
    }

}



