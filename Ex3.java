import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Avioes> filaAvioes = new LinkedList<>();
        

        while (true) {
            System.out.println("\nMENU DE OPERAÇÕES");
            System.out.println("1- LISTAR QUANTIDADE DE AVIOES NA FILA DE DECOLAGEM");
            System.out.println("2- DECOLAR AVIAO");
            System.out.println("3- ADICIONAR AVIAO");
            System.out.println("4- LISTAR AVIOES");
            System.out.println("5- CARACTERISTICAS DO PRIMEIRO AVIAO");
            System.out.println("6- PARAR PROGRAMA");
            System.out.print("DIGITE A OPERAÇÃO: ");

            int op = input.nextInt();
            input.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("A QUANTIDADE DE AVIOES NA FILA DE PARTIDA É: " + filaAvioes.size());
                    break;
                case 2:
                    if (!filaAvioes.isEmpty()) {
                        System.out.println("O AVIAO " + filaAvioes.poll().getNome() + " DECOLOU.");
                    } else {
                        System.out.println("A FILA ESTÁ VAZIA.");
                    }
                    break;
                case 3:
                    Avioes novoAviao = new Avioes(null, null);
                    System.out.print("INSIRA O NOME DO AVIAO: ");
                    novoAviao.setNome(input.nextLine());
                    System.out.print("INSIRA A DISCRICAO DO AVIAO: ");
                    
                    novoAviao.setDiscricao(input.nextLine());
                    filaAvioes.add(novoAviao);
                    break;
                case 4:
                    for (Avioes aviao : filaAvioes) {
                        System.out.println("AVIAO: " + aviao.getNome());
                    }
                    break;
                case 5:
                    if (!filaAvioes.isEmpty()) {
                        System.out.println("A DESCRICAO É: " + filaAvioes.peek().getDiscricao());
                    } else {
                        System.out.println("A FILA ESTÁ VAZIA.");
                    }
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
