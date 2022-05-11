package com.example.td1_dessaulx;

public class Hifi extends Appareil{

    public Hifi(){}
    /**
     * surcharge de la methode affichage
     * sous la forme " Hifi :10"
     */
    public String toString () {
        String r = "";
        r += " Hifi :" + intensite;
        return (r);
    }
}