package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dados.Calculadora;
import times.Times;

public class Programa {

	public static void main(String[] args) {
		
		List<Times>lista = new ArrayList<>();
		
		String arquivo = "c:\\hacker\\br16.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(" ");
				lista.add(new Times(campos[0], Integer.parseInt(campos[1])));
				linha = br.readLine();
			}
			
			Times x = Calculadora.maior(lista);
			Times y = Calculadora.menor(lista);
			System.out.print("Maior: ");
			System.out.println(x);
			System.out.print("Menor: ");
			System.out.println(y);

		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
 	}

}
