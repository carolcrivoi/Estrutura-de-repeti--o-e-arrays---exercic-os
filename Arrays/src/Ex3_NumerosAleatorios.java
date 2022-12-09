import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatórios = new int[20];

        for (int i = 0; i < numerosAleatórios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatórios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatórios) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos Números aleatórios: ");
        for (int numero : numerosAleatórios) {
            System.out.println((numero + 1) + " ");
        }

        System.out.println("Antecessores dos Números aleatórios: ");
        for (int numero : numerosAleatórios) {
            System.out.println((numero - 1) + " ");
        }
    }

}
