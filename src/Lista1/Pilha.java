package Lista1;

public class Pilha {
    private char [] elementos;
    private int topo = -1;

    public Pilha() {
        this.elementos = new char[10];
    }

    public Pilha(int tamanho) {
        this.elementos = new char[tamanho];
    }

    public boolean isFull() {
        return this.topo == this.elementos.length - 1;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public void push(char letra) {
        if (isFull()) {
            System.out.printf("A pilha está cheia!\n");
            return;
        }

        elementos[++topo] = letra;

        System.out.printf("%c adicionado com sucesso!\n", letra);
    }

    public char pop() {
        char elementoRecuperado;

        if (isEmpty()) {
            System.out.printf("Pilha está vazia!\n");
            return '\0';
        }

       elementoRecuperado = this.elementos[topo];

        elementos[topo] = '\0';
        topo--;

        return elementoRecuperado;
    }

    public char peek() {

        if (isEmpty()) {
            System.out.printf("Pilha está vazia!\n");
            return '\0';
        }

        return this.elementos[topo];
    }
}
