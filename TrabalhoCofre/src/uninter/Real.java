package uninter;

import java.util.Objects;
//Criando objeto que está herdando os atributos e metodos da Classe moeda
public class Real extends Moeda {
		//Criando um objeto valor
		double valor;
		//Criando o construtor de Real
		Real(double valor) {
			super(valor);
			this.valor = valor;
			// TODO Auto-generated constructor stub
		}
		//Utilizando o metodo info da classe Mãe Moeda
		@Override
		public void info() {
			
			System.out.println("Real:"+ valor);
			// TODO Auto-generated method stub
			
		}
		//Utilizando o metodo converter da classe Mãe Moeda
		@Override
		public double converter() {
			//Retornando o valor de real
			double total = valor;
			return total;
		}
		//Chamando metodo toString para formatar a saida do objeto
		@Override
		public String toString() {
			return "Real valor:" + valor;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(valor);
			return result;
		}
		//chamando metodo equals para conseguir fazer operações comparações e atribuições do objeto
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Real other = (Real) obj;
			return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		}

	
	
}
