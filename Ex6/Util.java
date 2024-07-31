package Ex6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
public class Util {
    public static Queue<Integer> criarFilaAleatoria(int quantidade) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();

    for (int i = 0; i < quantidade; i++) {
        // Gera um número aleatório entre -quantidade/2 e quantidade/2
        int numeroAleatorio = random.nextInt(quantidade) - quantidade / 2;
        fila.add(numeroAleatorio);
    }
    return fila;
    }

    public static void processarFilaEPilha(Queue<Integer> fila, Stack<Integer> pilha) {
        while (!fila.isEmpty()) {
            int numero = fila.poll();
    
            if (numero > 0) {
                pilha.push(numero);
            } else if (numero < 0) {
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                } else {
                    System.out.println("Pilha vazia!");
                }
            } else {
                System.out.println("Número neutro encontrado: " + numero);
            }
        }
    }
}
