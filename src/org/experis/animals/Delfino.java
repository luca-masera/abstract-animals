package org.experis.animals;

public class Delfino extends Animale implements AnimaleNuotante{
    @Override
    public void verso() {
        System.out.println("Il verso del delfino è : sup sup");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia: pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!");
    }

    @Override
    public String toString() {
        return ("Delfino");
    }
}

