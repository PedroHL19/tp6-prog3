import java.util.Random;

class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.Inserir(new No(25));
        arvore.Inserir(new No(20));
        arvore.Inserir(new No(12));
        arvore.Inserir(new No(27));
        arvore.Inserir(new No(30));
        arvore.Inserir(new No(11));
        arvore.Inserir(new No(98));
        arvore.order(arvore.raiz);
        arvore.encaminhamentosSemRecursividade();
        arvore.removerTodosPares();
        System.out.println("Número de nós: " + arvore.contarNos());
        System.out.println("Número de nós não-folha: " + arvore.contarNosNaoFolha());
        System.out.println("Número de folhas: " + arvore.contarFolhas());
        System.out.println("Altura da árvore: " + arvore.calculaAltura());
        arvore.order(arvore.raiz);
        arvore.espelhaArvore();
    }
}