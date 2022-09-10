/* Um estudante do ensino m�dio gostaria de controlar melhor suas notas nas disciplinas
 * exatas. Ele gostaria de poder enxergar suas notas dos 4 bimestres com exatamente duas
 * casas decimais e em formato de matriz, como no exemplo a seguir:
 * Matem�tica: 9.53, 7.57, 8.87, 7.30.
 * F�sica: 8.66, 9.00, 9.44, 6.77.
 * Qu�mica: 8.45, 8.01, 7.88, 9.21.
 * Al�m disso, o estudante gostaria de poder escolher algumas op��es de visualiza��o de
 * acordo com o menu abaixo:
 * Todas as notas de todas as disciplinas;
 * Qual a maior nota e em qual disciplina foi;
 * A m�dia das notas de alguma disciplina (solicitar qual);
 * As notas de um dos bimestres (solicitar qual);
 * Encerrar.
 * Fa�a um programa que permita cadastrar as notas de acordo com o exemplo (considerando
 * a ordem das disciplinas) e forne�a os dados supracitados. O menu deve ser exibido
 * repetitivamente, at� que o usu�rio deseje encerrar o programa.
 */

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] notas = new double[3][4];

		int opcao = 0;

		String disciplinaMaiorNota = "";

		String disciplina = "";

		double[][] bimestre1 = new double[3][4];

		double[][] bimestre2 = new double[3][4];

		int opcaoBimestre = 0;

		double maiorNota = 0;

		double mediaMatematica = 0;

		double mediaFisica = 0;

		double mediaQuimica = 0;

		int opcaoMedia = 0;

		int l = 0;

		int c = 0;

		String mensagem = "";

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 4; c++) {

				if (l == 0) {
					disciplina = "Matem�tica";
				} else {
					if (l == 1) {
						disciplina = "F�sica";
					} else {
						disciplina = "Qu�mica";
					}
				}

				notas[l][c] = Double.parseDouble(
						JOptionPane.showInputDialog("Insira sua " + (c + 1) + "� nota de " + disciplina + ": "));

				while ((notas[l][c] < 0) || (notas[l][c] > 10)) {

					notas[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Insira novamente sua nota: "));

				}

				if (l == 0) {
					mediaMatematica = mediaMatematica + notas[l][c];
				} else {
					if (l == 1) {
						mediaFisica = mediaFisica + notas[l][c];
					} else {
						mediaQuimica = mediaQuimica + notas[l][c];
					}
				}

				if (c < 2) {
					bimestre1[l][c] = notas[l][c];
				} else {
					if ((c > 2) && (c <= 4)) {
						bimestre2[l][c] = notas[l][c];
					}
				}

				if (maiorNota < notas[l][c]) {
					maiorNota = notas[l][c];
					disciplinaMaiorNota = disciplina;
				}
			}
		}

		mediaMatematica = mediaMatematica / 4;
		mediaFisica = mediaFisica / 4;
		mediaQuimica = mediaQuimica / 4;

		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja ver: " + "\n 1 - Todas as notas"
					+ "\n 2 - Maior nota" + "\n 3 - M�dia das notas de cada disciplina" + "\n 4 - Notas no bimestre"
					+ "\n 5 - Encerrar"));

			switch (opcao) {

			case 1:

				mensagem = "Mat     F�s     Qu�\n";

				for (c = 0; c < 4; c++) {
					for (l = 0; l < 3; l++) {

						mensagem = mensagem + notas[l][c] + "      ";

					}
					mensagem = mensagem + "\n";
				}

				JOptionPane.showMessageDialog(null, mensagem, "Notas de todas as disciplinas: ",
						JOptionPane.INFORMATION_MESSAGE);

				break;

			case 2:

				JOptionPane.showMessageDialog(null, "Sua maior nota foi " + maiorNota + ", em: " + disciplinaMaiorNota,
						"Maior nota:", JOptionPane.INFORMATION_MESSAGE);

				break;

			case 3:

				opcaoMedia = Integer.parseInt(JOptionPane.showInputDialog("Qual mat�ria voc� deseja saber sua m�dia?"
						+ "\n 1 - Matem�tica." + "\n 2 - F�sica" + "\n 3 - Qu�mica."));

				switch (opcaoMedia) {

				case 1:

					JOptionPane.showMessageDialog(null, "Sua m�dia em Matem�tica foi: " + mediaMatematica,
							"M�dia de Matem�tica", JOptionPane.INFORMATION_MESSAGE);

					break;

				case 2:

					JOptionPane.showMessageDialog(null, "Sua m�dia em F�sica foi: " + mediaFisica, "M�dia de F�sica",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				case 3:

					JOptionPane.showMessageDialog(null, "Sua m�dia em Qu�mica foi: " + mediaQuimica, "M�dia de Qu�mica",
							JOptionPane.INFORMATION_MESSAGE);

					break;

				default:

					JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Aten��o", JOptionPane.WARNING_MESSAGE);

					break;
				}

				break;

			case 4:

				opcaoBimestre = Integer.parseInt(JOptionPane.showInputDialog("Qual bimestre voc� deseja ver suas notas?"
						+ "\n 1 - 1� Bimestre" + "\n 2 - 2� Bimestre" + "\n 3 - 3� Bimestre" + "\n 4 - 4� Bimestre"));

				switch (opcaoBimestre) {

				case 1:

					mensagem = "Mat     F�s     Qu�\n";

					for (c = 0; c < 1; c++) {
						for (l = 0; l < 3; l++) {

							mensagem = mensagem + notas[l][c] + "      ";

						}
						mensagem = mensagem + "\n";
					}

					JOptionPane.showMessageDialog(null, mensagem, "1� bimestre", JOptionPane.INFORMATION_MESSAGE);

					break;

				case 2:

					mensagem = "Mat     F�s     Qu�\n";

					for (c = 1; c < 2; c++) {
						for (l = 0; l < 3; l++) {

							mensagem = mensagem + notas[l][c] + "      ";

						}
						mensagem = mensagem + "\n";
					}

					JOptionPane.showMessageDialog(null, mensagem, "2� bimestre", JOptionPane.INFORMATION_MESSAGE);

					break;

				case 3:

					mensagem = "Mat     F�s     Qu�\n";

					for (c = 2; c < 3; c++) {
						for (l = 0; l < 3; l++) {

							mensagem = mensagem + notas[l][c] + "      ";

						}
						mensagem = mensagem + "\n";
					}

					JOptionPane.showMessageDialog(null, mensagem, "3� bimestre", JOptionPane.INFORMATION_MESSAGE);

					break;

				case 4:

					mensagem = "Mat     F�s     Qu�\n";

					for (c = 3; c < 4; c++) {
						for (l = 0; l < 3; l++) {

							mensagem = mensagem + notas[l][c] + "      ";

						}
						mensagem = mensagem + "\n";
					}

					JOptionPane.showMessageDialog(null, mensagem, "4� bimestre", JOptionPane.INFORMATION_MESSAGE);

					break;

				default:

					JOptionPane.showMessageDialog(null, "Op��o inv�lida.", "Aten��o", JOptionPane.WARNING_MESSAGE);

					break;

				}

				break;

			case 5:

				JOptionPane.showMessageDialog(null, "Programa encerrado.", "Fim", JOptionPane.INFORMATION_MESSAGE);

				break;

			default:

				JOptionPane.showMessageDialog(null, "Op��o inv�lida.", "Aten��o", JOptionPane.WARNING_MESSAGE);

				break;

			}

		} while (opcao != 5);

	}
}
