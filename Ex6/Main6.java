package Ex6;
import java.util.Queue;
import java.util.Stack;

public class Main6 {
        public static void main(String[] args) {
            Queue<Integer> fila = Util.criarFilaAleatoria(1000);
            Stack<Integer> pilha = new Stack<>();
            Util.processarFilaEPilha(fila, pilha);
        }
}
