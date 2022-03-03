package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dados.Calculadora;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>lista = new ArrayList();
		
		String arquivo = "c:\\hacker\\entrada.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha = br.readLine();
			while (linha != null) {
				lista.add(Integer.parseInt(linha));
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
