package org.experis.animals;

public abstract class Animale {



    //DORMI è UGUAE PER TUTTI
    public void dormi(){

        System.out.println("Tutti gli animali quando dormono fanno: Zzz");
    };
    //VERSO E MANGIA SONO ABSTRACT E POSSONO CAMBIARE NELLE VARIE ESTENSIONI DI CLASSI
    public abstract void verso();
    public abstract void mangia();
}
