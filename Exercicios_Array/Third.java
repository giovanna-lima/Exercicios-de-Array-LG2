package Exercicios_Array;

public class Third {

	public static void main(String[] args) {
	
	int vet [][] = new int [100][100], i, j;
	 System.out.println("Os numeros da subtra��o s�o: ");
	for ( i=0; i<vet.length;i++) {
		for (j=0; j<vet[i].length; j++) {
			
	   vet [i][j] = j-i; 
	
	   System.out.print(i);
	   System.out.print(" - "+j);
		   System.out.println( vet[i][j]);
	  
	   
	}
	 
		System.out.println("Os n�meros da multiplica��o s�o");
		for ( i=0; i<vet.length;i++) {
			for( j=0; j<vet[i].length; j++) {
				
		   vet [i][j] = (j+i)*7; 
		
		   
			   System.out.println( vet[i][j]);
		  
			}

	}

}
}
}