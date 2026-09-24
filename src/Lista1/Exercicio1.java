package Lista1;

public class Exercicio1 {
    private String fraseUsuario;
    private boolean temC = false;

    public Exercicio1(String fraseUsuario) {
        this.fraseUsuario = fraseUsuario;

        boolean validarLetras = true;

        for (int i = 0; i < this.fraseUsuario.length(); i++) {
            char c = this.fraseUsuario.charAt(i);
            if (c != 'A' && c != 'B' && c != 'C') {
                validarLetras = false;
                break;
            }
        }

        if (validarLetras){
            iniciarExercicio();
        } else {
            System.out.println("Não há as letras definidas no exercício");
        }
    }

    public void iniciarExercicio() {
        int tamanho = fraseUsuario.length();
        int i;

        Pilha pilhaEx1 = new Pilha(tamanho);

        for (i = 0; i < tamanho; i++) {
            if (this.fraseUsuario.charAt(i) == 'C') {
                temC = true;
                break;
            }

            pilhaEx1.push(this.fraseUsuario.charAt(i));
        }

        if (temC) {
            boolean validado = true;
            for (int j = i + 1; j < tamanho; j++) {

                if (pilhaEx1.isEmpty()) {
                    System.out.println("Há mais letras pós o C");
                    validado = false;
                    break;
                }

                char elementoDaPilha = pilhaEx1.pop();
                if (elementoDaPilha != this.fraseUsuario.charAt(j)) {
                    validado = false;
                    break;
                }
            }

            if (!pilhaEx1.isEmpty()) {
                System.out.println("Há mais letras na pilha (antes de C)");
                validado = false;
            }

            if (validado) {
                System.out.println("Palavras iguais!");
            } else {
                System.out.println("Palavras diferentes!");
            }
        } else {
            System.out.println("Não há C na frase!");
        }


    }
}
