public class Palindromo {
    private String texto;

    public Palindromo(String texto) {
        this.texto = texto;
    }

    public boolean PalindromoPali() {
        String textoLimpo = limparTexto(texto);
        return textoLimpo.equals(inverterTexto(textoLimpo));
    }

    private String limparTexto(String texto) {
        StringBuilder textoLimpo = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                textoLimpo.append(Character.toLowerCase(c));
            }
        }
        return textoLimpo.toString();
    }

    //Método p inverter texto
    private String inverterTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    //Método p mostrar o texto invertido
    public void mostrarTextoInvertido() {
        String textoInvertido = inverterTexto(texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }    
}
