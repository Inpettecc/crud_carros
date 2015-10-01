package br.edu.inpettecc.bi;

import java.util.HashMap;
import java.util.HashSet;
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
	public void adicionarMarca(Marca marca) {};
	public void adicionarCarro(Carro carro) {};
	public void adicionarPessoa(Pessoa pessoa) {};
	public void associarPessoaACarro(Pessoa pessoa, Carro carro) {};
}
