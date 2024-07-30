import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Ex6 {
    @SuppressWarnings("unused")
    private static Queue<Integer> criarFilaAleatoria(int quantidade) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            fila.add(random.nextInt(2001) - 1000); // Gera números entre -1000 e 1000
        }

        return fila;
    }

    @SuppressWarnings("unused")
    private static void processarFilaEPilha(Queue<Integer> fila, Stack<Integer> pilha) {
        while (!fila.isEmpty()) {
            int numero = fila.poll();

            if (numero > 0) {
                pilha.push(numero);
            } else if (numero < 0) {
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                } else {
                    System.out.println("Pilha vazia");
                }
            } else {
                System.out.println("Número igual a zero: " + numero);
            }
        }
    }
}
