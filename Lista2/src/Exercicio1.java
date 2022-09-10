/* Fa�a um programa que receba um vetor de valores e mostre a 
 * quantidade de  valores negativos. Os valores e o tamanho do 
 * vetor devem ser informados pelo usu�rio.
 */

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
		
		double[] vetor = new double[tamanho];
		
		int numNegativos = 0;

		for (int i = 0; i < tamanho; i++) {
		
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor da "+(i+1)+"� posi��o: "));
			
			if (vetor[i] < 0) {
				
				//numNegativos = numNegativos+1;
				numNegativos += 1;
				
				
			}
		
		}
		
		JOptionPane.showMessageDialog(null, numNegativos, "Quantidade de n�meros negativos: ", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}
