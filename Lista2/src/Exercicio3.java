/* Escreva um programa que leia um número inteiro e apresente um menu para o usuário escolher:
 * 1 - Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número);
 * 2 - Verificar se o número é par;
 * 3 - Verificar se o número está entre 0 e 1000;
 * 4 - Sair
 * Após as entradas de dados, deve ser mostrado ao usuário o resultado da respectiva opção 
 * escolhida, e novamente o menu. Para a opção “4- Sair”, utilize o comando System.exit(0);
 */

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String repetir;

		int num = 0;

		int numMult = 0;

		int opcao = 0;

		num = Integer.parseInt((JOptionPane.showInputDialog("Insira um número inteiro: ")));

		do {

			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("Escolha o que deseja fazer: " + "\n 1 - Verificar se é múltiplo"
							+ "\n 2 - Verificar se é par" + "\n 3 - Verificar se está entre 0 e 1000" + "\n 4 - Sair"));

			switch (opcao) {

			case 1:
				numMult = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para ver se é multiplo: "));

				if ((num % numMult) == 0) {

					JOptionPane.showMessageDialog(null, "Seu número é múltiplo de " + numMult, "Verificador múltiplo",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					JOptionPane.showMessageDialog(null, "Seu número não é múltiplo de " + numMult,
							"Verificador múltiplo", JOptionPane.INFORMATION_MESSAGE);

				}

				break;

			case 2:
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "Seu número é par.", "Verificador par",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, "Seu número não é par.", "Verificador par",
							JOptionPane.INFORMATION_MESSAGE);

				}

				break;

			case 3:
				if ((num >= 0) && (num <= 1000)) {
					JOptionPane.showMessageDialog(null, "Seu número está entre 0 e 1000.", "Verificador posição",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, "Seu número não está entre 0 e 1000.", "Verificador posição",
							JOptionPane.INFORMATION_MESSAGE);

				}

				break;

			case 4:
				JOptionPane.showMessageDialog(null, "Programa encerrado.", "Atenção", JOptionPane.WARNING_MESSAGE);

				System.exit(0);

				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.", "Atenção", JOptionPane.WARNING_MESSAGE);

				break;

			}

			repetir = JOptionPane.showInputDialog("Deseja voltar ao menu?" + "\n Digite S para sim e N para não.");
		} while (repetir.equalsIgnoreCase("S"));

	}

}
