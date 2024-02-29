package uninter;

import java.util.Objects;

//Criando um objeto do tipo Dolar utilizando a Classe abstrata Moeda Como tipo ou seja 
//Estou usando a herança para pegar os atributos e metodos da Classe Moeda abstrata
public class Dolar extends Moeda {
		//Criando atributo double para armazenar o valor dos parametros do  construtor que recebe o valor da Classe Moeda
		double valor;
		//Criando construtor de dolar que recebe como parametro objeto valor
		Dolar(double valor) {
			super(valor);
			this.valor = valor;
			// TODO Auto-generated constructor stub
		}
		//Recebendo o metodo info abstrato da classe mãe Moeda
		@Override
		public void info() {
			System.out.println("Dolar:"+ valor);
			
		}
		//Recebendo o metodo converte abstrato da classe Moeda
		@Override
		 public double converter() {
			//Fazendo calculo de conversão  e retornado total
			double total = valor*4.94;
			return total;
		}
		//Formatando a saida com metodo to String
		@Override
		public String toString() {
			return "Dolar valor:" + valor;
		}
		//Criando metodo hashCode para gerar um endereço hash
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(valor);
			return result;
		}
		//Criando metodo  equals para conseguir fazer interações entre os objetos como por exemplo remover o objeto de uma lista e fazer calculos de comparação
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dolar other = (Dolar) obj;
			return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		}

	

}
