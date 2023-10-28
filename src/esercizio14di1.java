public class esercizio14di1 {
    public static int somma(int[][] matriz) {
        int suma = 0;

        for (int elemento : matriz[0]) {
            suma += elemento;
        }
        
        return suma;
    }

    public static void main(String[] args) {
        int[][] array = {
                {3, 3, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int risultatoSomma = somma(array);
        System.out.println(risultatoSomma);
    }


}
