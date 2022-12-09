public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 2, 6, 9, 4, 15, 8 };

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {

            System.out.println(vetor[count] + " ");
            count++;

        }

        System.out.println("Vetor Inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");

        }
    }

}