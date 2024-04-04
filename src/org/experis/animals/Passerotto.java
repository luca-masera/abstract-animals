package org.experis.animals;

public class Passerotto extends Animale{
    @Override
    public void verso() {
        System.out.println("Il verso del passerotto è: Cip Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia frutta secca.");
    }
}
