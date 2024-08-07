package Ex4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Util {
    public static Queue<Integer> criarFilaAleatoria(int tamanho, int limite) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            fila.add(random.nextInt(limite));
        }
        return fila;
    }
     public static Queue<Integer> inverter(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> filaInvertida = new LinkedList<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            filaInvertida.add(pilha.pop());
        }

        return filaInvertida;
    }
}
