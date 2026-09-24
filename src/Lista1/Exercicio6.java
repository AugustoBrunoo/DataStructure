package Lista1;

public class Exercicio6 {
    private String frase;
    private char c;

    public Exercicio6(String frase) {
        this.frase = frase;
    }

    public String realizarInversao() {
        if (this.frase.isEmpty()) {
            System.out.println("Não há frase suficiente!");
            return null;
        }

        int tamanho = this.frase.length();
        StringBuilder novafrase = new StringBuilder();
        Pilha pilha = new Pilha(tamanho);

        for (int i = 0; i < tamanho; i++) {
            c = this.frase.charAt(i);

            if (c != ' ') {
                pilha.push(c);
            } else {
                while (!pilha.isEmpty()) {
                    novafrase.append(pilha.pop());
                }
                novafrase.append(" ");
            }
        }

        while (!pilha.isEmpty()) {
            novafrase.append(pilha.pop());
        }

        return novafrase.toString();
    }
}
