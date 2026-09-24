package Aula01;

public class Pilha {
    private int[]elementos;
    private int capacidade;
    private int topo;

    // Construtor
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1; // significa que o array está vazio
    }

    // Está vazio
    public boolean isEmpty() {
        return this.topo == -1;
    }

    // Está cheio (Verifica se a pilha está cheia)
    public boolean isFull() {
        return this.topo == this.capacidade - 1;
    }

    // Push
    public void push(int valor) {

        if (isFull()) {
            System.out.printf("A pilha está cheia!\n");
            return;
        }

        this.topo++; // sobe o topo
        this.elementos[this.topo] = valor;
        System.out.printf("Empilhado: %d", valor);
    }

    public int pop(int valor) {
        if (isEmpty()) {
            System.out.printf("A pilha está vazia!\n");
            return -1;
        }

        int valorDesempilhado = this.elementos[this.topo];
        this.topo--;
        return valorDesempilhado;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.printf("Pilha vazia!\n");
            return -1;
        }

        return this.elementos[this.topo];
    }
}
