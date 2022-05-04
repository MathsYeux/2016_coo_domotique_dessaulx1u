package com.example.td1_dessaulx;

public class Lampe {
    private boolean isOn = false;
    String nom;

    public boolean isAllume(){
        return (isOn);
    }

    public Lampe(String n){
        this.nom = n;
    }

    public void allumer(){
        this.isOn = true;
    }

    public void eteindre(){
        this.isOn = false;
    }

    public String toString(){
        String s;
        if (this.isOn){
            s = "On";
        }else{
            s = "Off";
        }
        return (this.nom + " : " + s);
    }
}