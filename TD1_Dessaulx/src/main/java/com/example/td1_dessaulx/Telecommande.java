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
        Iterator iterateur = this.lampes.iterator();
        for(int i = 0, i < indiceLampe, i++){
            
        }
    }

    public void desactiverLampe(int indiceLampe){

    }

    public void activerTout(){
        if (this.lampes.isEmpty()){
            throw new Error("Aucune lampe reliee a la telecommande");
        }else {
            Iterator iterateur = this.lampes.iterator();
            while (iterateur.hasNext()) {
                activerLampe(iterateur.next());
            }
        }
    }

    public static void main(String[] args) {
        throw new Error("code non ecrit");
    }
}