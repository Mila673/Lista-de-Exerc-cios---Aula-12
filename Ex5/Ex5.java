package Ex5;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

class Ex5 {
    private Queue<Integer> fila;
    private Stack<Integer> pilha;
    private Random gerador;

    public Ex5() {
        this.fila = new LinkedList<>();
        this.pilha = new Stack<>();
        this.gerador = new Random();
    }

    public void gerarNumeros(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int numero = gerador.nextInt();
            if (fila.contains(numero)) {
                pilha.push(numero);
            } else {
                fila.add(numero);
            }
        }
    }

    public void imprimirEstruturas() {
        System.out.println("Fila:");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
        System.out.println("Pilha:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
