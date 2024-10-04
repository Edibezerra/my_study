package study;

import java.util.HashSet;
import java.util.Set;

public class PalavrasMesmoConjunto {

	public static boolean palavrasMesmoConjunto(String palavra1, String palavra2) {
		// Transformar as palavras em conjuntos de letras
		Set<Character> conjuntoPalavra1 = new HashSet<>();
		Set<Character> conjuntoPalavra2 = new HashSet<>();

		// Adicionar as letras de palavra1 no conjunto
		for (char c : palavra1.toCharArray()) {
			conjuntoPalavra1.add(c);
		}

		// Adicionar as letras de palavra2 no conjunto
		for (char c : palavra2.toCharArray()) {
			conjuntoPalavra2.add(c);
		}

		// Verificar se os conjuntos são iguais
		return conjuntoPalavra1.equals(conjuntoPalavra2);
	}

	public static void main(String[] args) {
		String palavra1 = "ajmor";
		String palavra2 = "roma";

		if (palavrasMesmoConjunto(palavra1, palavra2)) {
			System.out.println("As palavras possuem o mesmo conjunto de letras.");
		} else {
			System.out.println("As palavras NÃO possuem o mesmo conjunto de letras.");
		}
	}

}
