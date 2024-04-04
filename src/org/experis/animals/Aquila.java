package org.experis.animals;

public class Aquila extends Animale{
    @Override
    public void verso() {
        System.out.println("Il verso dell'aquila è: CIP CIP FORTE");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia: carne");
    }

}
