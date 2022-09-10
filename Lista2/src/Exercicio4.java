/*Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. Fa�a um programa que 
 * permita ao usu�rio informar uma quantidade de lat�o em quilos e forne�ao total de cobre
 * e zinco necess�rios para fabricar essa quantidade. 
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimal = new DecimalFormat("0.00");
		// decimal.setMinimumFractionDigits(8);

		double kilos = Double.parseDouble(JOptionPane.showInputDialog("Quantos kilos de lat�o: "));

		double zinco = kilos * 0.3;

		double resto = kilos * 0.7;

		JOptionPane.showMessageDialog(null, "Quantidade total de lat�o necess�rio: " + decimal.format(kilos) + " KG",
				"Lat�o", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantidade de cobre necess�rio: " + decimal.format(resto) + " KG", "Cobre",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantidade de zinco necess�rio: " + decimal.format(zinco) + " KG",
				"Zinco", JOptionPane.INFORMATION_MESSAGE);

	}

}
