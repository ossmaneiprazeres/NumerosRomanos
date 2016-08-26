package br.com.caelum.romanos;

import java.util.HashMap;
import java.util.Map;

public class NumerosRomanos {

	private Map<Integer, String> mapaRomanos = new HashMap<Integer, String>();

	public Map<Integer, String> getMapaRomanos() {
		return mapaRomanos;
	}

	public NumerosRomanos() {
		populaMapaRomanos();
	}

	private void populaMapaRomanos() {
		mapaRomanos.put(1, "I");
		mapaRomanos.put(2, "II");
		mapaRomanos.put(3, "III");
		mapaRomanos.put(4, "IV");
		mapaRomanos.put(5, "V");
		mapaRomanos.put(6, "VI");
		mapaRomanos.put(7, "VII");
		mapaRomanos.put(8, "VIII");
		mapaRomanos.put(9, "IX");
		
		mapaRomanos.put(10, "X");
		mapaRomanos.put(20, "XX");
		mapaRomanos.put(30, "XXX");
		mapaRomanos.put(40, "XL");
		mapaRomanos.put(50, "L");
		mapaRomanos.put(60, "LX");
		mapaRomanos.put(70, "LXX");
		mapaRomanos.put(80, "LXXX");
		mapaRomanos.put(90, "XC");
		
		mapaRomanos.put(100, "C");
		mapaRomanos.put(200, "CC");
		mapaRomanos.put(300, "CCC");
		mapaRomanos.put(400, "CD");
		mapaRomanos.put(500, "D");
		mapaRomanos.put(600, "DC");
		mapaRomanos.put(700, "DCC");
		mapaRomanos.put(800, "DCCC");
		mapaRomanos.put(900, "CM");
		
		mapaRomanos.put(1000, "M");
		mapaRomanos.put(2000, "MM");
		mapaRomanos.put(3000, "MMM");
	}
}
