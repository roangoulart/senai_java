/*Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um programa que 
 * permita ao usuário informar uma quantidade de latão em quilos e forneçao total de cobre
 * e zinco necessários para fabricar essa quantidade. 
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimal = new DecimalFormat("0.00");
		// decimal.setMinimumFractionDigits(8);

		double kilos = Double.parseDouble(JOptionPane.showInputDialog("Quantos kilos de latão: "));

		double zinco = kilos * 0.3;

		double resto = kilos * 0.7;

		JOptionPane.showMessageDialog(null, "Quantidade total de latão necessário: " + decimal.format(kilos) + " KG",
				"Latão", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantidade de cobre necessário: " + decimal.format(resto) + " KG", "Cobre",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Quantidade de zinco necessário: " + decimal.format(zinco) + " KG",
				"Zinco", JOptionPane.INFORMATION_MESSAGE);

	}

}
