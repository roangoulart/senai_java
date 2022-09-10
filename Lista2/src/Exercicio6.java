/* Uma empresa deseja saber alguns dados sobre suas vendas
 * no passado. Fa�a um programa que armazene em um vetor o
 * valor total das vendas de cada um dos 12 meses do ano
 * (que dever� ser informado pelo usu�rio) e mostre:
 * O m�s com a maior venda;
 * O m�s com a menor venda;
 * A m�dia das vendas do ano todo;
 * A m�dia das vendas dos meses pares;
 * A m�dia das vendas do 2� semestre.
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decimal = new DecimalFormat("0.00");

		double[] faturamento = new double[12];

		double faturamentoSemestral = 0;

		double mediaVendas = 0;

		double mediaVendaPar = 0;

		double mediaVenda2Semestre = 0;

		double maiorValor = 0;

		double menorValor = 0;

		int menorMes = 0;

		int maiorMes = 0;

		for (int l = 0; l < 12; l++) {
			faturamento[l] = Double
					.parseDouble(JOptionPane.showInputDialog("Insira o faturamento bruto do " + (l + 1) + "� m�s: "));
			faturamentoSemestral = faturamentoSemestral + faturamento[l];

			if (l == 0) {
				maiorValor = faturamento[l];
				menorValor = faturamento[l];
				maiorMes = l;
				menorMes = l;
			}

			if (faturamento[l] > maiorValor) {
				maiorValor = faturamento[l];
				maiorMes = l;
			} else if (menorValor > faturamento[l]) {
				menorValor = faturamento[l];
				menorMes = l;
			}

			if (l % 2 == 1) {
				mediaVendaPar = mediaVendaPar + faturamento[l];
			}

			if (l >= 6) {
				mediaVenda2Semestre = mediaVenda2Semestre + faturamento[l];
			}

		}

		mediaVendas = faturamentoSemestral / 12;
		mediaVendaPar = mediaVendaPar / 6;
		mediaVenda2Semestre = mediaVenda2Semestre / 6;

		JOptionPane.showMessageDialog(null, "M�s com maior venda: " + (maiorMes + 1), "M�s com maior venda",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "M�s com menor venda: " + (menorMes + 1), "M�s com menor venda",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "M�dia de vendas do ano: " + decimal.format(mediaVendas),
				"M�dia de vendas do ano", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "M�dia de vendas dos meses pares: " + decimal.format(mediaVendaPar),
				"M�dia de vendas dos meses pares", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "M�dia de vendas do 2� semestre: " + decimal.format(mediaVenda2Semestre),
				"M�dia de vendas 2� semestre", JOptionPane.INFORMATION_MESSAGE);

	}
}