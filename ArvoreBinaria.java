public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    private No InserirNovo(No novo, No atual) {
        if (atual == null)
            return novo;
        if (atual.valor > novo.valor)
            atual.esquerda = InserirNovo(novo, atual.esquerda);
        else {
            if (novo.valor != atual.valor) {
                atual.direita = InserirNovo(novo, atual.direita);
            }
        }
        return atual;
    }

    public void Inserir(No novo) {
        raiz = InserirNovo(novo, raiz);
    }

    public void preordem(No elemento) {
        if (elemento != null) {
            System.out.println(elemento.valor);
            preordem(elemento.esquerda);
            preordem(elemento.direita);
        }
    }

    public void posOrdem(No elemento) {
        if (elemento != null) {
            posOrdem(elemento.esquerda);
            posOrdem(elemento.direita);
            System.out.println(elemento.valor);
        }
    }

    public void order(No elemento) {
        if (elemento != null) {
            order(elemento.esquerda);
            System.out.println(elemento.valor + " ");
            order(elemento.direita);
        }
    }

    private No encontrarElemento(No atual, int valor) {

        if (atual == null) {
            return null;
        }
        if (valor > atual.valor) {
            if (atual.direita != null) {
                if (atual.direita.valor == valor) {
                    return atual;
                }
            }
        } else {
            if (atual.esquerda != null) {
                if (atual.esquerda.valor == valor) {
                    return atual;
                }
            }
        }

        if (atual.valor > valor) {
            return encontrarElemento(atual.esquerda, valor);
        }
        if (atual.valor < valor) {
            return encontrarElemento(atual.direita, valor);
        }
        return null;
    }

    public void remover(int valor) {
        if (raiz != null) {
            No pai;
            No noX;
            if (raiz.valor == valor) {
                pai = raiz;
                noX = raiz;

            } else {
                pai = encontrarElemento(raiz, valor);
                if (pai.valor < valor) {
                    noX = pai.direita;
                } else {
                    noX = pai.esquerda;
                }
            }

            if (noX.direita == null && noX.esquerda == null) {
                if (pai.valor < valor) {
                    pai.direita = null;
                } else {
                    pai.esquerda = null;
                }
            } else {
                if (noX.direita != null && noX.esquerda != null) {
                    No direitaesquerdapai = maisEsquerdaPossivel(noX, noX.direita);
                    No substitute = direitaesquerdapai.esquerda;
                    direitaesquerdapai.esquerda = null;
                    substitute.direita = noX.direita;
                    substitute.esquerda = noX.esquerda;
                    noX.esquerda = null;
                    noX.direita = null;
                    if (pai.valor < valor) {
                        pai.direita = substitute;
                    } else {
                        pai.esquerda = substitute;
                    }
                } else {
                    if (noX.direita == null) {
                        if (pai.valor > valor) {
                            pai.esquerda = noX.esquerda;
                        } else {
                            pai.direita = noX.esquerda;
                        }
                        noX.esquerda = null;
                    } else if (noX.esquerda == null) {
                        if (pai.valor > valor) {
                            pai.esquerda = noX.direita;
                        } else {
                            pai.direita = noX.direita;
                        }
                        noX.direita = null;
                    }

                }
            }

        }

    }

    private No maisEsquerdaPossivel(No pai, No filhoAtual) {
        if (filhoAtual.esquerda == null)
            return pai;
        return maisEsquerdaPossivel(filhoAtual, filhoAtual.esquerda);
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.esquerda) + contarNos(no.direita);
    }

    public int contarNosNaoFolha() {
        return contarQuantidadeNosNaoFolha(raiz);
    }

    private int contarQuantidadeNosNaoFolha(No no) {
        if (no == null) {
            return 0;
        }
        if (no.esquerda == null && no.direita == null) {
            return 0;
        }
        return 1 + contarQuantidadeNosNaoFolha(no.esquerda) + contarQuantidadeNosNaoFolha(no.direita);
    }

    public int contarFolhas() {
        return contaQuantFolhas(raiz);
    }

    private int contaQuantFolhas(No no) {
        if (no == null) {
            return 0;
        }
        if (no.esquerda == null && no.direita == null) {
            return 1;
        }
        return contaQuantFolhas(no.esquerda) + contaQuantFolhas(no.direita);
    }

    public No removerTodosPares() {
        return removerPares(raiz);
    }

    private No removerPares(No no) {
        if (no != null) {
            removerPares(no.esquerda);
            removerPares(no.direita);
            if (no.valor % 2 == 0) {
                // System.out.println("Removendo: " + no.valor);
                remover(no.valor);
            }
        }
        return no;
    }

    public int calculaAltura() {
        return Altura(raiz);
    }

    private int Altura(No raiz) {
        if (raiz == null) {
            return -1;
        }
        int esquerdaAltura = Altura(raiz.esquerda);
        int direitaAltura = Altura(raiz.direita);
        if (esquerdaAltura > direitaAltura) {
            return esquerdaAltura + 1;
        } else {
            return direitaAltura + 1;
        }
    }

    public void espelhaArvore() {
        arvoreEspelhada(raiz);
    }

    private void arvoreEspelhada(No no) {
        if (no != null) {
            No aux = no.esquerda;
            no.esquerda = no.direita;
            no.direita = aux;

            arvoreEspelhada(no.esquerda);
            arvoreEspelhada(no.direita);
        }
    }

    public void encaminhamentosSemRecursividade() {
        preOrdemSemRecursividade(raiz);
        orderSemRecursividade(raiz);
        posOrdemSemRecursividade(raiz);
    }

    private void preOrdemSemRecursividade(No no) {
        System.out.println("Printando pre ordem sem recursividade -- RAIZ - ESQUERDA - DIREITA -- RED");
        Pilha pilha = new Pilha();
        pilha.empilhar(new Celula(no));
        while (!pilha.vazia()) {
            Celula celula = pilha.desempilhar();
            No atual = celula.no;
            System.out.println(atual.valor);
            if (atual.direita != null) {
                pilha.empilhar(new Celula(atual.direita));
            }
            if (atual.esquerda != null) {
                pilha.empilhar(new Celula(atual.esquerda));
            }
        }
        System.out.println("Fim ^_^");
    }

    private void posOrdemSemRecursividade(No no) {
        System.out.println("Printando pos ordem sem recursividade -- ESQUERDA - DIREITA - RAIZ -- ERD");
        Pilha pilha = new Pilha();
        Pilha pilhaAuxPrint = new Pilha();
        pilha.empilhar(new Celula(no));
        while (!pilha.vazia()) {
            Celula celula = pilha.desempilhar();
            No atual = celula.no;
            pilhaAuxPrint.empilhar(new Celula(atual));
            if (atual.esquerda != null) {
                pilha.empilhar(new Celula(atual.esquerda));
            }
            if (atual.direita != null) {
                pilha.empilhar(new Celula(atual.direita));
            }
        }
        while (!pilhaAuxPrint.vazia()) {
            Celula celulaAux = pilhaAuxPrint.desempilhar();
            System.out.println(celulaAux.no.valor);
        }
        System.out.println("Fim ^_^");
    }

    private void orderSemRecursividade(No no) {
        System.out.println("Printando em ordem sem recursividade -- ESQUERDA - RAIZ - DIREITA -- ERD");
        Pilha pilha = new Pilha();
        No aux = no;
        while (aux != null || !pilha.vazia()) {
            while (aux != null) {
                pilha.empilhar(new Celula(aux));
                aux = aux.esquerda;
            }
            aux = pilha.desempilhar().no;
            System.out.println(aux.valor);
            aux = aux.direita;
        }
        System.out.println("Fim ^_^");
    }
}