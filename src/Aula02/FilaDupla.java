package Aula02;

public class FilaDupla extends Fila {

    public FilaDupla(int tam) {
        super(tam);
    }

    // Método para inserir um elemento no início

    public boolean insereIni(int elemento) {
        int precedente;

        if (!cheia()) {
            precedente = (ini - 1 + tamanho) % tamanho; // calcula o indice precedente
            vetor[precedente] = elemento; // guarda o elemento na posição
            ini = precedente; // atualiza o início para a nova posição
            n++;
            return true;
        } else {
            return false;
        }
    }

    // Método para retirar o elemento do fim da fila
    public boolean removeFim() {
        int ultimo;

        if (!vazia()) {
            ultimo = (ini + n - 1) % tamanho; // calcula o indíce do último
            int elemento = vetor[ultimo]; // acessa e retira o elemento
            n--; // decrementa a contagem de elementos
            return true; // removido com sucesso
        } else {
            return false;
        }
    }
}
