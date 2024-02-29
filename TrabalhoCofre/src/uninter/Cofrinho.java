package uninter;
//Importanndo o metodo ArrayList para criar uma Lista privada na Classe Cofrinho
import java.util.ArrayList;

public class Cofrinho {
	    //Criando um ArrayList de Moeda Que pode receber varios Objetos do tipo Moeda
		private ArrayList <Moeda> listaMoedas = new ArrayList<Moeda>();
		
		//Criando metodo adicionar onde adiciona um Objeto especifico a lista com seu tipo e seu valor
		public void adicionar(Moeda moeda) {
			listaMoedas.add(moeda);
			
		}
		
		
		//Criando metodo remover onde remove um Objeto especifico a lista com seu tipo e seu valor
		public void remover(Moeda moeda) {
			listaMoedas.remove(moeda);
			
		}
		//Criando metodo listar onde lista os objetos de uma lista com seu tipo e seu valor
		public void listar() {
			for( Moeda moeda : listaMoedas) {
				System.out.println(moeda);
			}
			
		}
		//Criando metodo total convertido onde ela converte os valores dos objetos para real e retorna o total
		public void totalConvertidoReal() {
			//Criando um objeto total que recebe o total
			double total = 0;
			//Criando um for para pegar os items da lista e convertelos e atribuilos incrementando na classe total
			for(Moeda moeda : listaMoedas) {
				//Chamando metodo converter que converte o valor de objetos especificos para real e incrementa no objeto total
				total+= moeda.converter();
			}
			System.out.println("Total Convertido para real é " + total);
			
		}


		//Chamando metodo toString para formatar a saida do objeto Cofrinho
		@Override
		public String toString() {
			return "Cofrinho [listaMoedas=" + listaMoedas + "]";
		}
		
		
		
		
		
		
		
}
