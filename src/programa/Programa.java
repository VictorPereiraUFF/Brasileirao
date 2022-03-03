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
		// TODO Auto-generated method stub
		
		List<Integer>lista = new ArrayList();
		
		String arquivo = "c:\\hacker\\br16.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split("	");
				lista.add(new Times(campos[1], Integer.parseInt(campos[2]), Integer.parseInt(campos[3]), Integer.parseInt(campos[4]), Integer.parseInt(campos[5]), Integer.parseInt(campos[6]), Integer.parseInt(campos[7]), Integer.parseInt(campos[8])));
				linha = br.readLine();
			}
			
			Integer x = Calculadora.maior(lista);
			Integer y = Calculadora.menor(lista);
			Integer j = Calculadora.padraoMaior(lista);
			Integer k = Calculadora.padraoMenor(lista);
			System.out.print("Maior: ");
			System.out.println(x);
			System.out.print("Menor: ");
			System.out.println(y);
			System.out.print("Padrão Maior: ");
			System.out.println(j);
			System.out.print("Padrão Menor: ");
			System.out.println(k);
		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
 	}

}
