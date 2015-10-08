package br.edu.inpettecc.bi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.edu.inpettecc.models.Carro;
import br.edu.inpettecc.models.Marca;
import br.edu.inpettecc.models.Pessoa;

public class CarrosBI {
	//Para melhor design isso deveria ir dentro de outra classe, que simularia o banco de dados.
	//Idealmente o pacote chamaria: br.edu.inpettecc.dao
	private Set<Marca> marcas = new HashSet<Marca>();
	private Set<Carro> carros = new HashSet<Carro>();
	private Set<Pessoa> pessoas = new HashSet<Pessoa>();
	private Map<Pessoa, Carro> carroPorPessoa = new HashMap<Pessoa, Carro>();
	
	public void listar() {};
	public void adicionarMarca(Marca marca) {
		marcas.add(marca);
	};
	public void adicionarCarro(Carro carro) {
		carros.add(carro);
	};
	
	public List<Carro> getCarros() {
		return new ArrayList<Carro>(carros);
	}
	
	public void adicionarPessoa(Pessoa pessoa) {};
	public void associarPessoaACarro(Pessoa pessoa, Carro carro) {}
	
	public List<Marca> getMarcas() {
		return new ArrayList<Marca>(marcas);
	}
	
}
