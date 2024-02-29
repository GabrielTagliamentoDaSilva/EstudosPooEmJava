package uninter;
import java.util.Objects;
//Criando um  objeto do tipo Euro que recebe como parametros a classe mãe Moeda abstrata
public class Euro extends Moeda{
		//Objeto tipo double valor
		double valor;
		//Construtor da Classe Euro
		Euro(double valor) {
			super(valor);
			this.valor = valor;
			// TODO Auto-generated constructor stub
		}
		//Utilizando o metodo abstrato da classe mãe Moeda para mostra a quantidade euro no Objeto Euro
		@Override
		public void info() {
			System.out.println("Euro:"+ valor);
			
		}
		//Criando um  metodo converter da classe mãe abstrata Moeda que calcula a conversão de Euro para real e retorna o total
		@Override
		public double converter() {
			double total = valor*5.35;
			return total;
		}
		//Chamando metodo toString para formatar a saida do objeto
		@Override
		public String toString() {
			return "Euro valor:" + valor;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(valor);
			return result;
		}
		//Chamando metodo equal para conseguir fazer comparações e calculos iterações  de objetos e valores dentro do objeto
		//Já que java não consegue diferenciar os objetos com a Classe parecida  por padrão então precisamos mostrar para ele
		// Que os objetos são diferentes assim podem remover os objetos do ArraList do cofrinho
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Euro other = (Euro) obj;
			return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		}
	
	
	
	
	

}
