package Exercicios_Array;

public class Fourth {

	public static void main(String[] args) {
		
		int [][] vet = new int [50][100];
		for (int i= vet.length -1; i>0 ; i--) {
			for(int j=vet.length -1; j>0; j--) {
			vet[i][j]= (i+j) ;
				   System.out.println("Os números da subtração do vetor são: " + vet[i][j]);
			   }
		}
		}


}
