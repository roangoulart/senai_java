/* Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um clube. O
 * programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2- N�O), seu
 * sal�rio l�quido e h� quanto tempo frequenta o clube (em meses). O usu�rio dever�
 * digitar �encerrar� quando n�o tiver mais pessoas para registrar.  Como dados de sa�da,
 * o programa deve exibir:
 * A m�dia das idades das pessoas;
 * A m�dia salarial das pessoas;
 * Quantos s�o fumantes e quantos n�o s�o fumantes;
 * A porcentagem de pessoas que frequentam o clube h� mais de 03 meses. 
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

			fuma = Integer.parseInt(JOptionPane.showInputDialog("Voc� fuma?" + "\n 1 - Sim" + "\n 2 - N�o"));

			switch (fuma) {
			case 1:
				somaFuma = somaFuma + 1;
				break;

			case 2:
				naoFuma = naoFuma + 1;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida.", "Aten��o", JOptionPane.WARNING_MESSAGE);

				break;
			}
			sal = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio l�quido: "));

			mediaSal = mediaSal + sal;

			meses = Integer
					.parseInt(JOptionPane.showInputDialog("Informe em meses quanto tempo voc� frequenta o clube"));

			if (meses >= 3) {
				quantidadePessoas = quantidadePessoas + 1;

			}

			repetir = JOptionPane
					.showInputDialog("H� mais algu�m para registrar?" + "\n Digite S para sim e N para n�o.");

		} while (repetir.equalsIgnoreCase("S"));

		somaIdade = somaIdade / pessoas;

		mediaSal = mediaSal / pessoas;

		porcentagem = (quantidadePessoas * 100) / pessoas;

		JOptionPane.showMessageDialog(null, "M�dia de idade das pessoas: " + somaIdade, "M�dia idade",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "M�dia de sal�rio l�quido: " + decimal.format(mediaSal), "M�dia sal�rio",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantos fumantes: " + somaFuma, "Fumantes",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantos n�o fumantes: " + naoFuma, "N�o fumantes",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null,
				"% de pessoas que frequantam o clube a mais de 3 meses: " + decimal.format(porcentagem) + "%",
				"% de pessoas frequentadoras", JOptionPane.INFORMATION_MESSAGE);

	}

}
