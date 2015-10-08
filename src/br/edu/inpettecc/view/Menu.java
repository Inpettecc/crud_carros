package br.edu.inpettecc.view;

import java.util.List;
import java.util.Scanner;

import br.edu.inpettecc.bi.CarrosBI;
import br.edu.inpettecc.models.Carro;
import br.edu.inpettecc.models.Marca;

public class Menu {
	// Para melhor arquitetura esse objeto deveria ser instanciado em uma outra classe,
	// de preferência na classe Main você instanciaria este objeto e passaria ele para a classe Menu
	private CarrosBI bi = new CarrosBI();

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
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		List<Marca> marcas = bi.getMarcas();
		
		System.out.println("Entre com a cor: ");
		carro.setCor(sc.nextLine());
		
		System.out.println("Entre com o modelo do carro: ");
		carro.setModelo(sc.nextLine());
		
		System.out.println("Escolha a marca: ");
		for(int i = 0; i < marcas.size(); i++) {
			System.out.println(i + "- " + marcas.get(i));
		}
		carro.setMarca(marcas.get(sc.nextInt()));
		
		System.out.println("Entre com o ano: ");
		carro.setAno(sc.nextLine());
		
		bi.adicionarCarro(carro);
	}

	private void listar() {
		System.out.println("Marcas:");
		for (Marca marca : bi.getMarcas()) {
			System.out.println(marca);
		}
		
		System.out.println("Carros:");
		for (Carro carro : bi.getCarros()) {
			System.out.println(carro);
		}
	}

	private void associarPessoaACarro() {
		System.out.println("Associar pessoa a carro");
	}

	private void adicionarPessoa() {
		System.out.println("Adicionar pessoa");
		
	}

	private void adicionarMarca() {
		Scanner sc = new Scanner(System.in);
		Marca marca = new Marca();
		
		System.out.println("Entre com o nome da Marca: ");
		marca.setNome(sc.nextLine());
		
		System.out.println("Entre com o nome do país de origem: ");
		marca.setPaisOrigem(sc.nextLine());
		
		bi.adicionarMarca(marca);
	}
}
