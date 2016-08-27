package br.com.caelum.romanos;

public class Conversor {

	private NumerosRomanos numerosRomanos = new NumerosRomanos();

	private int numeroAConverter;

	public int getNumeroAConverter() {
		return this.numeroAConverter;
	}

	private void setNumeroAConverter(Integer numeroAConverter) {
		this.numeroAConverter = numeroAConverter;
	}

	private int pegaQuantidadeDeDigitosDoNumeroAConverter() {
		return Integer.toString(this.numeroAConverter).length();
	}

	private int pegaODigitoNoNumeroAConverter(int indice) {
		String digitoEmString = "" + Integer.toString(this.numeroAConverter).charAt(indice);
		return Integer.parseInt(digitoEmString);
	}

	private String pegaValorRomanoNoMapaDadoODigitoNoNumeroAConverter(int digito, int exp) {
		if (digito == 0) {
			return "";
		}
		int index = (int) (digito * Math.pow(10, exp));
		return this.numerosRomanos.getMapaRomanos().get(index);
	}

	public void converte(Integer numeroAConverter) {
		setNumeroAConverter(numeroAConverter);
		int ultimaPosicaoDoArrayDoNumeroAConverter = pegaQuantidadeDeDigitosDoNumeroAConverter();
		int posicaoDoDigitoNoNumeroAConverter = ultimaPosicaoDoArrayDoNumeroAConverter;
		int posicaoDoDigitoEmRelacaoAExpoentesDeBaseDez;
		String numeroRomanoConvertido = "";
		if (numeroAConverter >= 4000) {
			System.out.println("Ainda não é possivel devolver a Conversão de\num Número maior ou igual à 4000 ");
		} else {
			while (posicaoDoDigitoNoNumeroAConverter > 0) {
				posicaoDoDigitoEmRelacaoAExpoentesDeBaseDez = ultimaPosicaoDoArrayDoNumeroAConverter
						- posicaoDoDigitoNoNumeroAConverter;
				posicaoDoDigitoNoNumeroAConverter--;
				numeroRomanoConvertido = pegaValorRomanoNoMapaDadoODigitoNoNumeroAConverter(
						pegaODigitoNoNumeroAConverter(posicaoDoDigitoNoNumeroAConverter),
						posicaoDoDigitoEmRelacaoAExpoentesDeBaseDez) + numeroRomanoConvertido;
			}
			System.out.println("Introduzio: " + getNumeroAConverter() + "\nCONVERTIDO: " + numeroRomanoConvertido);
		}

	}

}
