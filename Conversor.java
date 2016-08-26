package br.com.caelum.romanos;

import java.util.HashMap;
import java.util.Map;

public class Conversor {

	private NumerosRomanos numerosRomanos = new NumerosRomanos();

	public String com1Digito(String posicao) {
		return this.numerosRomanos.getMapaRomanos().get(Integer.parseInt(posicao));		
	}


	public String com2Digito(String posicao) {
		return this.numerosRomanos.getMapaRomanos().get(Integer.parseInt(posicao)*10);
	}

	public String com3Digito(String posicao) {
		return this.numerosRomanos.getMapaRomanos().get(Integer.parseInt(posicao)*100);
	}

	public String com4Digito(String posicao) {
		return this.numerosRomanos.getMapaRomanos().get(Integer.parseInt(posicao)*1000);
	}
}
