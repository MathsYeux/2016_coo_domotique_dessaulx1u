package com.example.td1_dessaulx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTelecommande {
    @Test
    public void test01_premierajout(){
        Telecommande telecommande = new Telecommande();
        Lampe l1 = new Lampe();

        assertTrue(telecommande.estVide(),"lampes doit etre vide");

        telecommande.ajouterLampe(l1);

        assertFalse(telecommande.estVide(),"lampes ne doit pas etre vide");
    }

    public void test02_deuxiemeajout(){
        Telecommande telecommande = new Telecommande();
        Lampe l1 = new Lampe();
        telecommande.ajouterLampe(l1);

        assertEquals(0,telecommande.nLampes(),"il doit y avoir 1 lampe (indice 0)");

        Lampe l2 = new Lampe();
        telecommande.ajouterLampe(l2);

        assertEquals(1,telecommande.nLampes(),"il doit y avoir 2 lampe (indice 1)");
    }

    public void test03_activationLampePos0(){
        Telecommande telecommande = new Telecommande();
        Lampe l1 = new Lampe();
        telecommande.ajouterLampe(l1);
        telecommande.activerLampe(0);

        assertTrue(telecommande.nLampes(),"il doit y avoir 1 lampe (indice 0)");

        Lampe l2 = new Lampe();
        telecommande.ajouterLampe(l2);

        assertEquals(1,telecommande.nLampes(),"il doit y avoir 2 lampe (indice 1)");
    }
}
