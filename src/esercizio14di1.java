public class esercizio14di1 {
    public static int somma(int[][] matriz) {
        int a = 0;

        for (int elemento : matriz[0]) {
            a += elemento;
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] array = {
                {3, 3, 3},
                {1, 2, 3},
                {4, 5, 6}
        };

        int risultatoSomma = somma(array);
        System.out.println(risultatoSomma);
    }


}
