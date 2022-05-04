package com.example;

import com.example.td1_dessaulx.Lampe;
import com.example.td1_dessaulx.Telecommande;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTelecommande {
    @Test
    public void test01_premierajout(){
        Telecommande telecommande = new Telecommande();
        Lampe l1 = new Lampe("lampe1");

        assertTrue(telecommande.estVide(),"lampes doit etre vide");

        telecommande.ajouterLampe(l1);

        assertFalse(telecommande.estVide(),"lampes ne doit pas etre vide");
    }

    @Test
    public void test02_deuxiemeajout(){
        Telecommande telecommande = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        telecommande.ajouterLampe(l1);

        assertEquals(1,telecommande.nLampes(),"il doit y avoir 1 lampe");

        Lampe l2 = new Lampe("lampe2");
        telecommande.ajouterLampe(l2);

        assertEquals(2,telecommande.nLampes(),"il doit y avoir 2 lampe");
    }

    @Test
    public void test03_activationLampePos0(){
        Telecommande telecommande = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        telecommande.ajouterLampe(l1);
        telecommande.activerLampe(0);

        assertEquals(1,telecommande.nLampes(),"il doit y avoir 1 lampe");

        Lampe l2 = new Lampe("lampe2");
        telecommande.ajouterLampe(l2);

        assertEquals(2,telecommande.nLampes(),"il doit y avoir 2 lampe");
    }
}
