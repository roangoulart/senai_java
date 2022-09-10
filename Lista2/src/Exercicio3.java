/* Escreva um programa que leia um n�mero inteiro e apresente um menu para o usu�rio escolher:
 * 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero);
 * 2 - Verificar se o n�mero � par;
 * 3 - Verificar se o n�mero est� entre 0 e 1000;
 * 4 - Sair
 * Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da respectiva op��o 
 * escolhida, e novamente o menu. Para a op��o �4- Sair�, utilize o comando System.exit(0);
 */

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String repetir;

		int num = 0;

		int numMult = 0;

		int opcao = 0;

		num = Integer.parseInt((JOptionPane.showInputDialog("Insira um n�mero inteiro: ")));

		do {

			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("Escolha o que deseja fazer: " + "\n 1 - Verificar se � m�ltiplo"
							+ "\n 2 - Verificar se � par" + "\n 3 - Verificar se est� entre 0 e 1000" + "\n 4 - Sair"));

			switch (opcao) {

			case 1:
				numMult = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero para ver se � multiplo: "));

				if ((num % numMult) == 0) {

					JOptionPane.showMessageDialog(null, "Seu n�mero � m�ltiplo de " + numMult, "Verificador m�ltiplo",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					JOptionPane.showMessageDialog(null, "Seu n�mero n�o � m�ltiplo de " + numMult,
							"Verificador m�ltiplo", JOptionPane.INFORMATION_MESSAGE);

				}

				break;

			case 2:
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "Seu n�mero � par.", "Verificador par",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, "Seu n�mero n�o � par.", "Verificador par",
							JOptionPane.INFORMATION_MESSAGE);

				}

				break;

			case 3:
				if ((num >= 0) && (num <= 1000)) {
					JOptionPane.showMessageDialog(null, "Seu n�mero est� entre 0 e 1000.", "Verificador posi��o",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, "Seu n�mero n�o est� entre 0 e 1000.", "Verificador posi��o",
							JOptionPane.INFORMATION_MESSAGE);

				}

				break;

			case 4:
				JOptionPane.showMessageDialog(null, "Programa encerrado.", "Aten��o", JOptionPane.WARNING_MESSAGE);

				System.exit(0);

				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida.", "Aten��o", JOptionPane.WARNING_MESSAGE);

				break;

			}

			repetir = JOptionPane.showInputDialog("Deseja voltar ao menu?" + "\n Digite S para sim e N para n�o.");
		} while (repetir.equalsIgnoreCase("S"));

	}

}
