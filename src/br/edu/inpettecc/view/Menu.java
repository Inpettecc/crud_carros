package br.edu.inpettecc.view;

import java.util.Scanner;

public class Menu {

	public void show() {
		int opcao = 0;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1- Adicionar marca");
			System.out.println("2- Adicionar carro");
			System.out.println("3- Adicionar pessoa");
			System.out.println("4- Associar pessoa a carro");
			System.out.println("5- Listar carros por pessoa");
			System.out.println("0- Sair");
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				adicionarMarca();
				break;
			case 2:
				adicionarCarro();
				break;
			case 3:
				adicionarPessoa();
				break;
			case 4:
				associarPessoaACarro();
				break;
			case 5:
				listar();
				break;
			case 0:
				System.out.println("Tchau!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
		} while(opcao != 0);
	}

	private void adicionarCarro() {
		System.out.println("Adicionar carro.");
	}

	private void listar() {
		System.out.println("Listar");
	}

	private void associarPessoaACarro() {
		System.out.println("Associar pessoa a carro");
	}

	private void adicionarPessoa() {
		System.out.println("Adicionar pessoa");
		
	}

	private void adicionarMarca() {
		System.out.println("Adicionar marca");
		
	}
}
