package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CaracteresComuns {

	public static String caracteresComuns(List<String> strings) {
		// Iniciar o conjunto de referência com os caracteres da primeira string
		Set<Character> charsComuns = new HashSet<>();
		for (char c : strings.get(0).toCharArray()) {
			charsComuns.add(c);
		}

		// Realizar interseção com os caracteres de cada string subsequente
		for (int i = 1; i < strings.size(); i++) {
			Set<Character> currentSet = new HashSet<>();
			for (char c : strings.get(i).toCharArray()) {
				currentSet.add(c);
			}
			charsComuns.retainAll(currentSet); // Faz interseção entre os conjuntos
		}

		// Converter o conjunto para uma lista e ordenar os caracteres em ordem
		// alfabética
		List<Character> sortedList = new ArrayList<>(charsComuns);
		Collections.sort(sortedList);

		// Converter a lista de caracteres de volta para uma string
		StringBuilder resultado = new StringBuilder();
		for (char c : sortedList) {
			resultado.append(c);
		}

		return resultado.toString();
	}

	public static void main(String[] args) {
		// Exemplo de uso:
		List<String> strings = Arrays.asList("cadeira", "caderno", "cafe");
		String resultado = caracteresComuns(strings);
		System.out.println(resultado); // Saída: "cae"
	}

}
