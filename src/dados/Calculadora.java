package dados;

import java.util.List;

public class Calculadora {

	public static Integer maior(List<Integer> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Erro: a lista está vazia");
		}

		Integer maior = list.get(0);
		
		for (Integer i : list) {
			if (i > maior) {
				maior = i;
			}
		}
		return maior;
	}

	public static Integer menor(List<Integer> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Erro: a lista está vazia");
		}

		Integer menor = list.get(0);

		for (Integer j : list) {
			if (j < menor) {
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

