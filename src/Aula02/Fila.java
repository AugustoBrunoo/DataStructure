package Aula02;

public class Fila {
    protected int [] vetor; // vetor que armazena os elementos
    protected int tamanho; // número máximo de elementos que o vetor suporta
    protected int n; // número que representa a posição
    protected int ini; // numero que representa a posição inicial da fila

    public Fila(int tam) {
        tamanho = tam;
        vetor = new int[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia() {
        return n == 0;
    }

    public boolean cheia() {
        return n == tamanho;
    }

    public boolean insere(int elemento) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho; // indice que será registrado o elemento
            vetor[fim] = elemento;
            n++;

            return true;
        } else {
            return false;
        }
    }

    public int retira() {
        if (!vazia()) {
            int elemento = vetor[ini]; // guarda o elemento a ser retirado
            ini = (ini + 1) % tamanho; // posição inicial alterada
            n--; // quantidade de elementos foi reduzida por ser eliminado o elemento;
            return elemento;
        } else {
            System.out.println("Fila vazia!");
            return -1;
        }
    }
}
