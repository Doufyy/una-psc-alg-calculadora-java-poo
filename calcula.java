import java.util.Scanner;

import entities.Calculadora;
public class calcula {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o calculo. (Exemplo: 5+5), ^ - para potencia, R - para raiz quadrada: "); 
		
		calculadora.numero1 = sc.nextDouble();
		calculadora.operacao = sc.next();
		calculadora.numero2 = sc.nextDouble();
		
		

		double resultado = calculadora.calcular();

		System.out.println("Resultado: " + resultado);
	}
}