package programacaoOrientadaObjeto.collections.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private int idade;
	private	double altura;

	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa p) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, p.getIdade());
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	@Override
	public String toString() {
		return "OrdenacaoNumero [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
}

class ComparatorPorAltura implements Comparator<Pessoa> {


	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getAltura(),p2.getAltura());
	}	
}



