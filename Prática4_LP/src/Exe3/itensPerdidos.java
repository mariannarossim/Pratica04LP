package Exe3;
import java.util.Scanner;

public class itensPerdidos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String item, autor,local,descricao,data;
		item[] itens = newitem[10]; // cria o valor de objetos
		int cont=0;
		int opcao;
		
		do {
			
			System.out.println("\n1- Cadastrar Item Perdido\n2-Buscar Item\n3-Sair");
			opcao= ler.nextInt();
			
			switch(opcao)
			
			{
			
			case1: 
				
			System.out.println("Item");
			item = ler.nextLine();
			
			System.out.println("Autor");
			autor = ler.nextLine();
			
			System.out.println("Local");
			local = ler.nextLine();
			
			System.out.println("Descrição");
			descricao = ler.nextLine();
			
			System.out.println("Data");
			data = ler.nextLine();
			
			ler.nextLine();
			itens[cont] = new item(item,autor,local,descicao,data);
			cont++;
			
			
				break;
			
			case2:
			
				
				
				
				break;
			
			case3:
				
				break;
			}
			
			
			
		}
	}

}
