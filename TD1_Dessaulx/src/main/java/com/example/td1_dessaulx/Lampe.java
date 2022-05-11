package com.example.td1_dessaulx;

public class Lampe extends Appareil {
    private int intensite = 0;
    String nom;

    public Lampe(String n){
        this.nom = n;
    }

    public String toString(){
        return (this.nom + " : " + this.intensite);
    }
}