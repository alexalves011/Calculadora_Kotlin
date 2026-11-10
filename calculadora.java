public class calculadora {

	public static double calcularPotencia(double base, double expoente) {
		return Math.pow(base, expoente);
	}

	public static void main(String[] args) {
		double num1 = 10.0;
		double num2 = 5.0;
		String operacao = "*"; // Pode ser "+", "-", "*", "/" ou "^"
		double resultado;

		switch (operacao) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				if (num2 == 0.0) {
					System.out.println("Erro: divisão por zero.");
					return;
				}
				resultado = num1 / num2;
				break;
			case "^":
				resultado = calcularPotencia(num1, num2);
				break;
			default:
				System.out.println("Operação inválida.");
				return;
		}

		System.out.println("Resultado da operação " + operacao + " entre "
				+ num1 + " e " + num2 + " é: " + resultado);
	}
}
