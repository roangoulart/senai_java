import javax.swing.JOptionPane;

public class Exercicio3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[3];

		String repetir;

		do {

			for (int i = 0; i < 3; i++) {

				numeros[i] = Integer.parseInt(JOptionPane
						.showInputDialog("Digite 3 n�meros diferentes! \n Digite o " + (i + 1) + "� n�mero"));
			}
			if (((numeros[0] == numeros[1]) || (numeros[0] == numeros[2]) || (numeros[1] == numeros[2]))) {
				JOptionPane.showMessageDialog(null, numeros, "Seus n�meros n�o podem se repetir!",
						JOptionPane.WARNING_MESSAGE);
			} else {
				if ((numeros[0] < numeros[1]) && (numeros[0] < numeros[2])) {
					JOptionPane.showMessageDialog(null, numeros[0], "O n�mero " + numeros[0] + " � o menor.",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (numeros[1] < numeros[2]) {
						JOptionPane.showMessageDialog(null, numeros[1], "O n�mero " + numeros[1] + " � o menor.",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, numeros[2], "O n�mero " + numeros[2] + " � o menor.",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			repetir = JOptionPane.showInputDialog("Deseja fazer de novo?" + "\n Digite S para sim e N para n�o.");
		} while (repetir.equalsIgnoreCase("S"));
	}
}
