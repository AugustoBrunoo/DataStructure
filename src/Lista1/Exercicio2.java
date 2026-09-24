package Lista1;

public class Exercicio2 {
    private String fraseUsuario;
    private boolean temC = false;

    public Exercicio2(String fraseUsuario) {
        this.fraseUsuario = fraseUsuario;

        boolean validarLetras = true;

        for (int i = 0; i < this.fraseUsuario.length(); i++) {
            char c = this.fraseUsuario.charAt(i);
            if (c != 'A' && c != 'B' && c != 'C' && c != 'D') {
                validarLetras = false;
                break;
            }
        }

        if (validarLetras){
            modos();
        } else {
            System.out.println("Não há as letras definidas no exercício");
        }
    }


    public void modos() {
        int tamanho = fraseUsuario.length();
        Pilha pilha = new Pilha(tamanho);

        boolean passouPeloC = false;
        boolean cadeiaValida = true;

        for (int i = 0; i < tamanho; i++) {
            char c = fraseUsuario.charAt(i);

            switch (c) {
                case 'A', 'B':
                    if (!passouPeloC) {
                        pilha.push(c);
                    } else {
                        if (pilha.isEmpty()) {
                            cadeiaValida = false;
                        } else {
                            char topo = pilha.pop();

                            if (topo != c) {
                                cadeiaValida = false;
                            }
                        }

                    }

                    break;
                case 'C':
                    if (passouPeloC) {
                        cadeiaValida = false;
                    }

                    passouPeloC = true;
                    break;

                case 'D':
                    if (!passouPeloC || !pilha.isEmpty()) {
                        cadeiaValida = false;
                        break;
                    }

                    passouPeloC = false;
                    break;

            }

            if (cadeiaValida) {
                System.out.printf("Cadeia válida!");
            } else {
                System.out.printf("Cadeia inválida!");
            }
        }
    }

}
