package com.example.td1_dessaulx;

import java.util.ArrayList;
import java.util.Iterator;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public boolean estVide(){
        return (this.lampes.isEmpty());
    }

    public int nLampes(){
        int i = 0;
        Iterator iterateur = this.lampes.iterator();
        while (iterateur.hasNext()) {
            i += 1;
            iterateur.next();
        }
        return (i);
    }

    public Telecommande(){
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l){
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){

    }

    public void activerTout(){
        if (this.lampes.isEmpty()){
            throw new Error("Aucune lampe reliee a la telecommande");
        }else {
            boolean trouve = false;
            for(int i = 0; i < this.nLampes(); i++){
                this.lampes.get(i).allumer();
            }
        }
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < this.nLampes(); i++){
            s += this.lampes.get(i).toString();
        }
        return ("");
    }

    public static void main(String[] args) {
        throw new Error("code non ecrit");
    }
}