package com.example;

import com.example.td1_dessaulx.Lampe;
import com.example.td1_dessaulx.Telecommande;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Lampe
 */
public class LampeTest {

	/**
	 * test du constructeur de lampe
	 */
	@Test
	public void testLampe() {
		// methode testee
		Lampe l = new Lampe("lampe1");

		// verification
		int res = l.getIntensite();
		assertEquals(res,0, "une nouvelle lampe devrait etre eteinte");
	}


	/**
	 * test allumer une lampe eteinte
	 */
	@Test
	public void testAllumer() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		l.allumer();

		// verification
		int res = l.getIntensite();
		assertEquals(100, res, "apres allumer(), la lampe devrait etre allumee");
	}

	@Test
	/**
	 * test allumer une lampe allumee
	 */
	public void testAllumer_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		l.allumer();

		// verification
		int res = l.getIntensite();
		assertEquals(100,res,"apres allumer, la lampe devrait etre allumee");
	}

	@Test
	/**
	 * test eteindre une lampe allumee
	 */
	public void testeteindre_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.eteindre();

		// verification
		int res = l.getIntensite();
		assertEquals(0, res,"apres eteindre, la lampe devrait etre eteinte");
	}

	@Test
	/**
	 * test to String lampe eteinte
	 */
	public void testToString_eteinte() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1 : 0",r,"affichage devrait etre off");
	}

	@Test
	/**
	 * test to String lampe allumee
	 */
	public void testToString_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1 : 0",r,"affichage devrait etre off");

	}

}
