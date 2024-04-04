package org.experis.animals;

public class Delfino extends Animale {
    @Override
    public void verso() {
        System.out.println("Il verso del delfino è : sup sup");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia: pesci");
    }
}
