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
			if (j.compareTo(menor) > 0) {
				menor = j;
			}
		}
		return menor;
	}
	

}

