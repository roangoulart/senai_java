package introducaoJava;

//Importando classe JOptionPane para usarmos os pain�is de di�logo.
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = new int[10];
		// receber e guardar os 10 n�meros.
		for (int i = 0; i < 10; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor: "));

		}

		// criando vari�vel para armazenar se usu�rio deseja encerrar o programa.
		String repetir;
		// in�cio da estrutura de repeti��o para o menu
		do {
			// solicitando op��o do menu
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que voc� deseja ver?" + "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor"
							+ "\n 3 - Somente o �ltimo valor" + "\n 4 - Ver os valores pares"));

			// programa��o do menu.
			switch (opcao) {
			// mostrando todos os valores.
			case 1:
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], "valor " + (i + 1),
							JOptionPane.INFORMATION_MESSAGE);

				}

				break;
			// mostrando somente o primeiro valor
			case 2:
				JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// Mostrando somente o �ltimo valor
			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "�ltimo valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// Mostrando somente os valores pares.
			case 4:
				String valoresPares = "";
				for (int i = 0; i < 10; i++) {
					if (valores[i] % 2 == 0) {
						if (valoresPares != "") {
							valoresPares += ", ";

						}
						valoresPares += valores[i];

					}
				}
				JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares", JOptionPane.INFORMATION_MESSAGE);
				break;
			// caso a op��o seja inv�lida
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;

			}

			// solicitando se usu�rio deseja voltar ao menu
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar: ");
		} while (repetir.equals("S"));

	}

}
