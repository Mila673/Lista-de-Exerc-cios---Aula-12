package Ex7;

import java.util.Queue;
import java.util.Stack;

public class Pilha {
    public static void inverterEImprimir(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        //limpa a pilha e preenche a fila na ordem inversa
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println(fila);
    }
}