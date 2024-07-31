package Ex4;
import java.util.Queue;

public class Main4 {
    public static void main(String[] args) {
        Queue<Integer> fila = Util.criarFilaAleatoria(100, 100); // Cria uma fila com 100 números aleatórios entre 0 e 99
        Queue<Integer> filaInvertida = Util.inverter(fila);

        // Imprimindo a fila original
        System.out.println("Fila original:");
        while (!fila.isEmpty()) {
            System.out.print(fila.poll() + " ");
        }
        System.out.println();

        // Imprimindo a fila invertida
        System.out.println("Fila invertida:");
        while (!filaInvertida.isEmpty()) {
            System.out.print(filaInvertida.poll() + " ");
        }
        System.out.println();
    }  
}
