package uninter;

import java.util.Objects;
//Criando  uma classe Abstrata com nome Moeda
public abstract class Moeda {
	//Criando objeto/variavel tipo double nome valor
	double valor;
	//Criando construtor da classe Moeda
	Moeda( double valor){
		
		this.valor = valor;
	}
	//Criando metodo abstrato retorna void
	 public abstract void info();
	//Criando metodo abstrato tipo double
	 public abstract double converter();

	//Metodo toString para formatar a saida do objeto no console para o usuario conseguir ler os resultados de cada objeto
	@Override
	public String toString() {
		return "Moeda valor: + valor ";
	}
	//Criando um hashCode
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
	//Criando metodo equals para conseguir remover os objetos da lista no cofrinho
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
	
	
	
}


