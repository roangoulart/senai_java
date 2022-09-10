/* (Lista 7 - Exercício 4) Faça um programa que carregue os valores
 * das vendas de uma loja no primeiro semestre do ano. Considere 
 * para tal uma matriz [6,4], sendo que são 06 meses e 04 semanas 
 * por mês. Ao final, mostre na tela:
 * Total de vendas do semestre.
 * Total vendido em cada mês.
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class testegit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decimal = new DecimalFormat("0.00");
		
		double[][] matriz = new double[6][4];

		int l = 0;

		int c = 0;

		double vendaSemestre = 0;

		double[] vendaMes = new double[6];

		for (l = 0; l < 6; l++) {
			for (c = 0; c < 4; c++) {

				matriz[l][c] = Double.parseDouble(JOptionPane
						.showInputDialog("Valor das vendas na " + (c + 1) + "ª semana, do " + (l + 1) + "º mês: "));

			vendaSemestre = matriz[l][c]+vendaSemestre;
			vendaMes[l] = matriz[l][c]+vendaMes[l];
			
			}
		}
		
		for (l = 0; l < 6; l++) {
			
			JOptionPane.showMessageDialog(null, decimal.format(vendaMes[l]), "Valor das vendas no "+ (l + 1) +"º mês: ", JOptionPane.INFORMATION_MESSAGE);
			
			}
		JOptionPane.showMessageDialog(null, decimal.format(vendaSemestre), "Valor das vendas no semestre: ",  JOptionPane.INFORMATION_MESSAGE);
	}
}
