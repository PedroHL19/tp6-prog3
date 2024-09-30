import java.util.Random;

class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.Inserir(new No(25));
        arvore.Inserir(new No(5));
        arvore.Inserir(new No(3));
        arvore.Inserir(new No(11));
        arvore.Inserir(new No(40));
        //
        //arvore.Inserir(new No(35));
        arvore.printarArvore();
        //arvore.encaminhamentosSemRecursividade();
        //System.out.println("Número de nós: " + arvore.contarNos());
        //System.out.println("Número de nós não-folha: " + arvore.contarNosNaoFolha());
        //System.out.println("Número de folhas: " + arvore.contarFolhas());
        //System.out.println("Altura da árvore: " + arvore.calculaAltura());
        arvore.removerTodosPares();
        //arvore.espelhaArvore();
        arvore.printarArvore();
    }
}