/* (Lista 1 - Exerc�cio 4) Fa�a um algoritmo que pe�a para o usu�rio inserir uma
 * quantidade em horas, outra em minutos e mais uma em segundos e mostre quantos
 * segundos esse hor�rio cont�m.
 */

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas horas: "));

		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos minutos: "));

		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos segundos: "));

		int resultado = horas * (3600) + minutos * (60) + segundos;

		JOptionPane.showMessageDialog(null, resultado + " segundos", "Resultado do hor�rio especificado: ",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
