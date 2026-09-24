package Lista1;

public class Exercicio4 {
    // Desempilhar até encontrar o elemento que queremos e empilhar novamente sem ele

    public static <T> void remover(PilhaGenerica<T> pilha, T elemento) {
        T atual;

        PilhaGenerica <T> auxiliar = new PilhaGenerica<>(100);

        while (!pilha.vazia()) {
            atual = pilha.pop();

            if (atual != null && atual.equals(elemento)) {
                // achou o elemento
                break;
            } else {
                auxiliar.push(atual);
            }

        }

        while (!auxiliar.vazia()) {
            atual = auxiliar.pop();
            pilha.push(atual);
        }

    }
}
