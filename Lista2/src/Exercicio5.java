/* Faça um programa que solicite alguns dados dos usuários que frequentam um clube. O
 * programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2- NÃO), seu
 * salário líquido e há quanto tempo frequenta o clube (em meses). O usuário deverá
 * digitar “encerrar” quando não tiver mais pessoas para registrar.  Como dados de saída,
 * o programa deve exibir:
 * A média das idades das pessoas;
 * A média salarial das pessoas;
 * Quantos são fumantes e quantos não são fumantes;
 * A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decimal = new DecimalFormat("0.00");

		String repetir;

		int idade = 0;

		int quantidadePessoas = 0;

		int somaIdade = 0;

		int somaFuma = 0;

		int fuma = 0;

		int naoFuma = 0;

		double sal = 0;

		double mediaSal = 0;

		int meses = 0;

		int pessoas = 0;

		double porcentagem = 0;

		do {

			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

			somaIdade = somaIdade + idade;

			pessoas = pessoas + 1;

			fuma = Integer.parseInt(JOptionPane.showInputDialog("Você fuma?" + "\n 1 - Sim" + "\n 2 - Não"));

			switch (fuma) {
			case 1:
				somaFuma = somaFuma + 1;
				break;

			case 2:
				naoFuma = naoFuma + 1;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.", "Atenção", JOptionPane.WARNING_MESSAGE);

				break;
			}
			sal = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário líquido: "));

			mediaSal = mediaSal + sal;

			meses = Integer
					.parseInt(JOptionPane.showInputDialog("Informe em meses quanto tempo você frequenta o clube"));

			if (meses >= 3) {
				quantidadePessoas = quantidadePessoas + 1;

			}

			repetir = JOptionPane
					.showInputDialog("Há mais alguém para registrar?" + "\n Digite S para sim e N para não.");

		} while (repetir.equalsIgnoreCase("S"));

		somaIdade = somaIdade / pessoas;

		mediaSal = mediaSal / pessoas;

		porcentagem = (quantidadePessoas * 100) / pessoas;

		JOptionPane.showMessageDialog(null, "Média de idade das pessoas: " + somaIdade, "Média idade",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Média de salário líquido: " + decimal.format(mediaSal), "Média salário",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantos fumantes: " + somaFuma, "Fumantes",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantos não fumantes: " + naoFuma, "Não fumantes",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"% de pessoas que frequantam o clube a mais de 3 meses: " + decimal.format(porcentagem) + "%",
				"% de pessoas frequentadoras", JOptionPane.INFORMATION_MESSAGE);

	}

}
