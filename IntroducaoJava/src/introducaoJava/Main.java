package introducaoJava;

//Importando classe JOptionPane para usarmos os painéis de diálogo.
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = new int[10];
		// receber e guardar os 10 números.
		for (int i = 0; i < 10; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));

		}

		// criando variável para armazenar se usuário deseja encerrar o programa.
		String repetir;
		// início da estrutura de repetição para o menu
		do {
			// solicitando opção do menu
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que você deseja ver?" + "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor"
							+ "\n 3 - Somente o último valor" + "\n 4 - Ver os valores pares"));

			// programação do menu.
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
			// Mostrando somente o último valor
			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "Último valor", JOptionPane.INFORMATION_MESSAGE);
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
			// caso a opção seja inválida
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;

			}

			// solicitando se usuário deseja voltar ao menu
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar: ");
		} while (repetir.equals("S"));

	}

}
