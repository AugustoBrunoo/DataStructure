package Lista1;

public class Exercicio5 {
    private String frase;
    private char c;

    public Exercicio5(String frase) {
        this.frase = frase;
    }

    public boolean verificarBalanceamento() {
        int tamanho = frase.length();

        Pilha pilha = new Pilha(tamanho);

        int i;

        for (i = 0; i < tamanho; i++) {
            this.c = this.frase.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                pilha.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();

                if (c == ')' && topo != '(') return false;
                if (c == ']' && topo != '[') return false;
                if (c == '}' && topo != '{') return false;
            }
        }

        return pilha.isEmpty();
    }
}
