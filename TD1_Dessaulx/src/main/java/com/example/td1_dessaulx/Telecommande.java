package com.example.td1_dessaulx;

import java.util.ArrayList;
import java.util.Iterator;

public class Telecommande {
    private ArrayList<Appareil> appareils;

    public boolean estVide(){
        return (this.appareils.isEmpty());
    }

    public int nAppareils(){
        int i = 0;
        Iterator iterateur = this.appareils.iterator();
        while (iterateur.hasNext()) {
            i += 1;
            iterateur.next();
        }
        return (i);
    }

    public Telecommande(){
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a){
        this.appareils.add(a);
    }

    public void activerAppareil(int indiceAppareil){
        this.appareils.get(indiceAppareil).allumer();
    }

    public void desactiverAppareil(int indiceAppareil){
        this.appareils.get(indiceAppareil).eteindre();
    }

    public void activerTout(){
        if (this.appareils.isEmpty()){
            throw new Error("Aucun appareil reliee a la telecommande");
        }else {
            boolean trouve = false;
            for(int i = 0; i < this.nAppareils(); i++){
                this.appareils.get(i).allumer();
            }
        }
    }

    public Appareil getAppareil(int i){
        return (this.appareils.get(i));
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < this.nAppareils(); i++){
            s += this.appareils.get(i).toString();
        }
        return ("");
    }

}