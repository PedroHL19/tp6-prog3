import java.util.Random;

class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.Inserir(new No(31));
        arvore.Inserir(new No(5));
        arvore.Inserir(new No(20));
        arvore.Inserir(new No(15));
        arvore.Inserir(new No(10));
        arvore.Inserir(new No(17));
        arvore.Inserir(new No(47));
        arvore.Inserir(new No(50));
        arvore.Inserir(new No(35));
        //arvore.order(arvore.raiz);
        //arvore.printarArvore();
        arvore.encaminhamentosSemRecursividade();
        //arvore.removerTodosPares();
        //System.out.println("Número de nós: " + arvore.contarNos());
        //System.out.println("Número de nós não-folha: " + arvore.contarNosNaoFolha());
        //System.out.println("Número de folhas: " + arvore.contarFolhas());
        //System.out.println("Altura da árvore: " + arvore.calculaAltura());
        //arvore.printarArvore();
        //arvore.order(arvore.raiz);
        //arvore.espelhaArvore();
    }
}