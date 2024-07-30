import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Ex4 {
    public static Queue<Integer> criarFilaAleatoria(int tamanho, int limite) {
        Queue<Integer> fila = new LinkedList<>();
        Set<Integer> numerosUsados = new HashSet<>();
        Random random = new Random();

        //Gera num. aleatorios ate a fila ter 100 num. aleatorios
        while (fila.size() < tamanho) {
            int numeroAleatorio= random.nextInt(100);
            if (!numerosUsados.contains(numeroAleatorio)) {
                fila.add(numeroAleatorio);
                numerosUsados.add(numeroAleatorio);
            }
        }
        return fila;
    }

    public static Queue<Integer> inverter(Queue<Integer> fila) {
    Stack<Integer> pilha = new Stack<>();
    Queue<Integer> filaInvertida = new LinkedList<>();

    //Enquanto a fila 1 nao estiver vazia
    while (!fila.isEmpty()) {
        pilha.push(fila.poll());
    }

    //Enquanto a pilha nao estiver vazia
    while (!pilha.isEmpty()) {
        filaInvertida.add(pilha.pop());
    }

    return filaInvertida;
    }
}
