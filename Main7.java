import java.util.LinkedList;
import java.util.Queue;

public class Main7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            fila.add(i);
        }

        System.out.println("Fila original: " + fila);
        
        Util.inverterFila(fila);

        System.out.println("Fila invertida: " + fila);
    }
}
