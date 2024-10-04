package study;

public class MissingNumber {
	
	 public static int findMissingNumber(int[] arr, int N) {
	        // Soma esperada dos primeiros N números inteiros
	        int expectedSum = N * (N + 1) / 2;
	        // Soma real dos elementos do array
	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }
	        // O número que falta é a diferença entre a soma esperada e a soma real
	        return expectedSum - actualSum;
	    }
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 5, 6}; // Exemplo de array
	        int N = 6; // O array contém números no intervalo de 1 a N, então N é 6
	        int missingNumber = findMissingNumber(arr, N);
	        System.out.println("O número que falta é: " + missingNumber);
	    }

}
