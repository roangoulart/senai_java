/* (Lista 2 - Exerc�cio 9) Fa�a um programa que pe�a ao usu�rio para informar 03
 * n�meros e mostre o menor entre eles. Considere que o usu�rio n�o poder� informar
 * n�meros iguais.
 */

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = new int[3];

		for (int i = 0; i < 3; i++) {

			numero[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite 3 n�meros diferentes!" + "\n Digite o " + (i + 1) + "� n�mero"));

			switch (i) {
			case 0:

				break;

			case 1:
				while (numero[1] == numero[0]) {
					JOptionPane.showMessageDialog(null, "Seus n�meros n�o podem se repetir!", "Aten��o",
							JOptionPane.WARNING_MESSAGE);

					numero[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Digite seu " + (i + 1) + "� n�mero novamente."));
				}

				break;

			case 2:
				while ((numero[2] == numero[1]) || (numero[2] == numero[0])) {
					JOptionPane.showMessageDialog(null, "Seus n�meros n�o podem se repetir!", "Aten��o",
							JOptionPane.WARNING_MESSAGE);
					numero[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Digite seu " + (i + 1) + "� n�mero novamente."));

				}

				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Aten��o", JOptionPane.WARNING_MESSAGE);
			}
		}

		if ((numero[0] < numero[1]) && (numero[0] < numero[2])) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero[0] + " � o menor.", "Menor n�mero",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (numero[1] < numero[2]) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero[1] + " � o menor.", "Menor n�mero",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero[2] + " � o menor.", "Menor n�mero",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
