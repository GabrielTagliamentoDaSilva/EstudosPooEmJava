package uninter;
// Importando o método scanner para conseguir receber inputs do objeto teclado
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int option;
		//Criando uma variavel que está instanciando a classe abstrata Moeda para poder fazer referencia na memoria das classes filhas Dolar Euro e Real
		Moeda moeda;
		//Criando o  objeto da Classe cofrinho com   nome de cofre
		Cofrinho cofre = new  Cofrinho();
		
		// Criando objeto tipoMoeda para selecionar o tipo de moeda nos menus
		int tipoMoeda;
		
		//Criando  um Menu de boas vindas com as opções do cofrinho
		System.out.println("Bem vindo ao cofrinho escolha a opção que deseja!");
		System.out.println("===========menu================");
		System.out.println("Digite 1 adicionar");
		System.out.println("Digite 2 remover");
		System.out.println("Digite 3 listar");
		System.out.println("Digite 4 Total convertido");
		System.out.println("Digite 0 para encerrar");
		System.out.println("==============================");
		option = teclado.nextInt();
		
		//Criando um loop com as opções da interface acima
		while(option != 0) {
			
			//Criando um switch case onde  se a opção for diferente de 0  ela entra em alguns dos casos  se for 1 entra no case de adicionar ou a pessoa pode adicionar um valor ao cofrinho
			// Após selecionar o tipo de moeda
			switch(option) {
				
				case 1:
					tipoMoeda = 0;
					//sub menu onde a pessoa pode depositar real dolar ou euro no cofrinho
					while(tipoMoeda > 3 || tipoMoeda <=0) {
						System.out.println("Digite 1 Real");
						System.out.println("Digite 2 Dolar");
						System.out.println("Digite 3 Euro");
						tipoMoeda = teclado.nextInt();
					}
					//Estrutura de controle onde ve o tipo de moeda escolhida  pergunta quanto a pessoa deseja depositar
					if(tipoMoeda ==1 ){
						System.out.println("Digite quanto em Real");
						//Dentro dos if e else tem uma instancia da Classe Moeda com nome moeda que faz referencia na memoria as classes filhas da classe mãe abstrata Moeda que recebe o valor com base
						//Nas caracteristicas de cada objeto exemplo variavel moeda do tipo Moeda recebe um novo objeto do Tipo REAL, EURO , OU DOLAR
						double valor = teclado.nextDouble();
						moeda = new Real(valor);
						
					}else if(tipoMoeda==2) {
						System.out.println("Digite quanto em  dolar");
						double valor = teclado.nextDouble();
						moeda = new Dolar(valor);
					}
					else {
						System.out.println("Digite quanto em  Euro");
						double valor = teclado.nextDouble();
						moeda = new Euro(valor);
					}
					
					//A cada if ele adiciona um objeto de tipos diferentes dentro do array no cofre
					cofre.adicionar(moeda);
					

					break;
					
				case 2:
					//Se option for igual a 2 entra no menu remover onde a pessoa pode selecionar o tipo de objeto Moeda que ele deseja remover se é EURO DOLAR OU REAL
					tipoMoeda = 0;
					//Um loop para ver o tipo de moeda 
					while(tipoMoeda > 3 || tipoMoeda <=0) {
						System.out.println("Digite 1 Real");
						System.out.println("Digite 2 Dolar");
						System.out.println("Digite 3 Euro");
						tipoMoeda = teclado.nextInt();
					}
					//Estrutura de controle onde pergunta qual é o valor baseado no Tipo de objeto Euro Dolar Real que será removido da Classe cofre que contém um ArrayList de varios objetos diferentes
					if(tipoMoeda ==1 ){
						System.out.println("Digite quanto em Real");
						double valor = teclado.nextDouble();
						moeda = new Real(valor);
						
					}else if(tipoMoeda==2) {
						System.out.println("Digite quanto em  dolar");
						double valor = teclado.nextDouble();
						moeda = new Dolar(valor);
					}
					else {
						System.out.println("Digite quanto em  Euro");
						double valor = teclado.nextDouble();
						moeda = new Euro(valor);
					}
					
					//Após cada opção da estrutura de controle remove o valor solicitado se ele já existir exemplo se já tiver na lista um OBJETO DO TIPO REAL 1,50 ele remove da lista
					cofre.remover(moeda);
					
					break;
				case 3:
					//No caso 3 chamamos o metodo listar dentro do objeto cofre que LISTA todos os Objetos dentro da lista privada no cofrinho
					cofre.listar();
					break;
				case 4: 
					//No caso 4 chamamos o metodo TotalConvertidoReal dentro do objeto cofre que calcula o total convertido de todos os valores em REAL ;
					cofre.totalConvertidoReal();
					break;
				default: 
					//caso não for digita uma das opções validas do menu o caso default é executa que mostra que a opção é inválida
					System.out.println("Opção inválida");
					
	
			}
			// Menu fora do switch para perguntar novamente qual opção do menu o usuário quer utilizar
			System.out.println("===========menu================");
			System.out.println("Digite 1 adicionar");
			System.out.println("Digite 2 remover");
			System.out.println("Digite 3 listar");
			System.out.println("Digite 4 Total convertido");
			System.out.println("Digite 0 para encerrar");
			System.out.println("==============================");
			option = teclado.nextInt();

		}
		//Caso o programa seja encerrado mostra ao usúario que foi encerrado
		System.out.println("Encerrando o cofrinho");

  }
}
