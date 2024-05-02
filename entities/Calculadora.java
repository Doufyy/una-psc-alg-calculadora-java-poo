package entities;


public class Calculadora {
	public double numero1;
	public double numero2;
	public String operacao;

	public Calculadora() {
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getNumero1() {
		return numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public String getOperacao() {
		return operacao;
	}

	public double calcular() {
		double resultado = 0;

		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "^":
			return Math.pow(numero1, numero2);
		case "R":
			if (numero1 < 0) {
				System.out.println("Não existe raiz de número negativo.");
			} else {
				return Math.sqrt(numero1);
			}
			break;
		case "/":
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Impossível realizar uma divisão por zero.");
			}
			break;
		default:
			System.out.println("Erro");
		}
		return resultado;

	}
}
