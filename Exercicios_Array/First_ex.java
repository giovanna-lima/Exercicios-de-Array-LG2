package Exercicios_Array;

public class First_ex {

	public static void main(String[] args) {
		int [] vet = new int [9];
		

for (int i=0; i<vet.length; i++) {
	vet[i]=i;
System.out.println("Aqui estão os elementos do vetor: " + vet[i]);
}

for (int i = 0; i<vet.length; i++) {
int x = vet[i] * 3;
System.out.println("Aqui estão os elmentos do vetor multiplicados por 3: " + x);
}
	}

}
