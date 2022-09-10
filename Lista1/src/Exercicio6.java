/* (Lista 5 - Exerc�cio 2) Crie uma calculadora que permita o c�lculo de
 * uma equa��o, sem limite de execu��es definido, da seguinte maneira:
 * 1. Pe�a o primeiro valor,
 * 2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
 * 3. Pe�a um segundo valor
 * 4. Efetue o c�lculo,
 * 5. Pe�a se o usu�rio quer continuar calculando. Se ele responder que
 * sim, volte para o passo 2 usando o resultado do c�lculo da linha 4
 * como primeiro valor, e se disser que n�o, mostre o resultado final.
 * Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.
 */

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String continuar = "";

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu 1� n�mero: "));

		double resultado = num1;

		do {
			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha pelo n�mero uma opera��o."
					+ "\n 1 - Soma (+)" + "\n 2 - Subtra��o (-)" + "\n 3 - Multiplica��o (*)" + "\n 4 - Divis�o (/)"));

			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu 2� n�mero:"));

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
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero maior que 0 (zero)."));

				}

				resultado = resultado / num2;

				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Aten��o", JOptionPane.WARNING_MESSAGE);

				break;
			}
			JOptionPane.showMessageDialog(null, resultado, "Resultado final: ", JOptionPane.INFORMATION_MESSAGE);
			continuar = JOptionPane.showInputDialog("Deseja continuar calculando?" + "\n S para sim e N para n�o.");

		} while (continuar.equalsIgnoreCase("S"));

	}

}
