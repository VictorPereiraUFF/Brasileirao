package dados;

import java.util.List;

public class Calculadora {

	public static <T extends Comparable<T>>T maior(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Erro: a lista está vazia");
		}

		T maior = list.get(0);
		
		for (T i : list) {
			if (i.compareTo(maior) < 0) {
				maior = i;
			}
		}
		return maior;
	}

	public static <T extends Comparable<T>> T menor(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Erro: a lista está vazia");
		}

		T menor = list.get(0);

		for (T j : list) {
			if (j.compareTo(menor) < 0) {
				menor = j;
			}
		}
		return menor;
	}
	
	public static Integer padraoMaior(List<Integer> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Erro: a lista está vazia");
		}

		Integer padraoMaior = list.get(0);
		
		for (Integer i : list) {
			if (i > list.get(0)) {
				padraoMaior += i;
			}
		}
		return padraoMaior;
	}

	public static Integer padraoMenor(List<Integer> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Erro: a lista está vazia");
		}

		Integer padraoMenor = list.get(0);

		for (Integer j : list) {
			if (j < list.get(0)) {
				padraoMenor -= j;
			}
		}
		return padraoMenor;
	}

	
}

