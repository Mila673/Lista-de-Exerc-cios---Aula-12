import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha<String> pilha = new Pilha<>();

        pilha.empilhar("Liliany");
        pilha.empilhar("Emily");
        pilha.empilhar("Matheus");
        pilha.empilhar("Ianny");
        pilha.empilhar("Fernando");
        pilha.empilhar("Pilha");
        pilha.empilhar("ED1");

        System.out.println("Qual a chave do objeto que deseja remover: ");
        String chave = input.nextLine();

        pilha.remover(chave);

        System.out.println("Pilha após a remoção:");
        pilha.imprimir();

        input.close();
    }
}
