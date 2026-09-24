package Lista1;

public class Exercicio3 {
    private char []vetor;
    private int topo1;
    private int topo2;

    public Exercicio3(int capacidadeTotal) {
        this.vetor = new char[capacidadeTotal];
        this.topo1 = -1;
        this.topo2 = capacidadeTotal;
    }

    // Função usadas nos dois
    public boolean isFull() {
        return topo1 + 1 == topo2;
    }

    // Pilha 1
    public void push1(char valor) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            vetor[++topo1] = valor;
        }
    }

    public char pop1() {
        if (isEmpty1()) {
            System.out.println("Pilha vazia!");
            return '\0';
        } else {
            return vetor[topo1--];
        }
    }

    public boolean isEmpty1() {
        return topo1 == -1;
    }

    // Pilha 2
    public void push2(char valor) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            vetor[--topo2] = valor;
        }
    }

    public char pop2() {
        if (isEmpty2()) {
            System.out.println("Pilha vazia!");
            return '\0';
        } else {
            return vetor[topo2++];
        }
    }

    public boolean isEmpty2() {
        return topo2 == vetor.length;
    }

}
