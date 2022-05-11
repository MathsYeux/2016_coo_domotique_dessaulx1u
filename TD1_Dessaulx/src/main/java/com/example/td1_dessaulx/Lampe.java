package com.example.td1_dessaulx;

public class Lampe extends Appareil {
    String nom;

    public Lampe(String n){
        this.nom = n;
    }

    public String toString(){
        return (this.nom + " : " + this.intensite);
    }

    public void allumer () {
        this.intensite = 100;
    }
}