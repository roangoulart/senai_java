/* (Lista 5 - Exercício 2) Crie uma calculadora que permita o cálculo de
 * uma equação, sem limite de execuções definido, da seguinte maneira:
 * 1. Peça o primeiro valor,
 * 2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
 * 3. Peça um segundo valor
 * 4. Efetue o cálculo,
 * 5. Peça se o usuário quer continuar calculando. Se ele responder que
 * sim, volte para o passo 2 usando o resultado do cálculo da linha 4
 * como primeiro valor, e se disser que não, mostre o resultado final.
 * Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.
 */

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String continuar = "";

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu 1º número: "));

		double resultado = num1;

		do {
			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha pelo número uma operação."
					+ "\n 1 - Soma (+)" + "\n 2 - Subtração (-)" + "\n 3 - Multiplicação (*)" + "\n 4 - Divisão (/)"));

			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu 2º número:"));

			switch (operacao) {
			case 1:
				resultado = resultado + num2;

				break;

			case 2:
				resultado = resultado - num2;

				break;

			case 3:
				resultado = resultado * num2;

				break;

			case 4:
				while (num2 == 0) {
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número maior que 0 (zero)."));

				}

				resultado = resultado / num2;

				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "Atenção", JOptionPane.WARNING_MESSAGE);

				break;
			}
			JOptionPane.showMessageDialog(null, resultado, "Resultado final: ", JOptionPane.INFORMATION_MESSAGE);
			continuar = JOptionPane.showInputDialog("Deseja continuar calculando?" + "\n S para sim e N para não.");

		} while (continuar.equalsIgnoreCase("S"));

	}

}
