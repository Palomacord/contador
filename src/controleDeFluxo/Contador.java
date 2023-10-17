package controleDeFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception exception) {
			System.out.println(exception);
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois ) {
			throw new ParametrosInvalidosException();
		}else {
			int contagem = parametroDois - parametroUm;
			
			for (int i=1 ; i<=contagem ;i++) {
				System.out.println(" Valor : " +i);
			}
		}
		//realizar o for para imprimir os números com base na variável contagem
	}
}
