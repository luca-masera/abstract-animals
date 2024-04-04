package org.experis.animals;

public class Cane extends Animale{
    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Il verso del cane è: Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia: carne.");
    }

    @Override
    public String toString() {
        return ("Cane");
    }
}
