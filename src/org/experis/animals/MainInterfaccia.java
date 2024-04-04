package org.experis.animals;

public class MainInterfaccia {

    public static void faiVolare (AnimaleVolante Animale ){
        Animale.vola();
    }
    public static void faiNuotare (AnimaleNuotante Animale ){

        Animale.nuota();
    }

    public static void main(String[] args) {

        Animale[] animales = {new Aquila(), new Cane(), new Delfino(), new Passerotto()};

        for (Animale animale:animales) {
            if (animale instanceof AnimaleNuotante){
                System.out.println(animale);
                faiNuotare((AnimaleNuotante) animale);
                System.out.println("--------------------");
            }
            if (animale instanceof AnimaleVolante){
                System.out.println(animale);
                faiVolare((AnimaleVolante) animale);
                System.out.println("--------------------");
            }
        }
    }

}



