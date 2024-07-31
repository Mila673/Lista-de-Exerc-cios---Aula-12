package Ex8;

import java.util.Random;
import java.util.Stack;

class TestaPilha {
    private Stack<Integer> pilhaNegativa;
    private Stack<Integer> pilhaPositiva;
    private Random random;

    public TestaPilha() {
        pilhaNegativa = new Stack<>();
        pilhaPositiva = new Stack<>();
        random = new Random();
    }

    public void sortearEarmazenar(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int numero = random.nextInt(201) -100;
            
            if (numero<0) {
                pilhaNegativa.push(numero);
                System.out.println("Número negativo na pilha N");
            } else if (numero>0) {
                pilhaPositiva.push(numero);
                System.out.println("Número positivo na pilha P");
            } else {
                // Se for zero, retirar um elemento de cada pilha e imprimir esses números
                if (!pilhaPositiva.isEmpty() && !pilhaNegativa.isEmpty()) {
                    System.out.println("Número positivo removido: " + pilhaPositiva.pop());
                    System.out.println("Número negativo removido: " + pilhaNegativa.pop());
                }
            }
        }
    }
}