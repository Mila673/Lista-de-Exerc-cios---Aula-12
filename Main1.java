public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        
        Palindromo palindromo = new Palindromo(texto);
        if (palindromo.PalindromoPali()) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        palindromo.mostrarTextoInvertido();  //Mostra o texto invertido
    scanner.close();
    }
}
