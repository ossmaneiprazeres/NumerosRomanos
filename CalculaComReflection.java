package br.com.caelum.romanos;

import java.lang.reflect.Method;

public class CalculaComReflection {
	
	Class[] parametroInteiro = {String.class};
	
	String endereco = "br.com.caelum.romanos.Conversor";
	
	
	public void converteNaturalParaRomano(int numeroAConverter) {
		

		int i = Integer.toString(numeroAConverter).length();
		int e = i + 1;
		String romano = "";

		while (i > 0) {
			String funcao = "com" + "" + (e - i) + "Digito";
			try {

				Class<?> classe = Class.forName(endereco);
				Object objecto = classe.newInstance();

				Method metodo = classe.getDeclaredMethod(funcao, parametroInteiro);
				romano = (String) metodo.invoke(objecto, new String("" + Integer.toString(numeroAConverter).charAt(i - 1)))
						+ romano;

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			i--;

		}
		System.out.println("resultado => " + romano);
	}
}
