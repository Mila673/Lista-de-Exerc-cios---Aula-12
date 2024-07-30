import java.util.EmptyStackException;

class Pilha<T> {
    private Node<T> topo;

    private static class Node<T> {
        private T dado;
        private Node<T> proximo;

        public Node(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public void empilhar(T dado) {
        Node<T> novoNo = new Node<>(dado);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public T desempilhar() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dado = topo.dado;
        topo = topo.proximo;
        return dado;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void remover(T chave) {
        if (isEmpty()) {
            return;
        }

        Node<T> anterior = null;
        Node<T> atual = topo;

        while (atual != null && !atual.dado.equals(chave)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            // Elemento não encontrado
            return;
        }

        // Remover o primeiro elemento
        if (anterior == null) {
            topo = atual.proximo;
        } else {
            anterior.proximo = atual.proximo;
        }
    }

    public void imprimir() {
        Node<T> atual = topo;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }
}
