import java.util.Random;

class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.Inserir(new No(30));
        arvore.Inserir(new No(5));
         arvore.Inserir(new No(3));
         arvore.Inserir(new No(20));
        arvore.Inserir(new No(40));
       // arvore.Inserir(new No(10));
        //arvore.Inserir(new No(17));
        //arvore.Inserir(new No(47));
        //arvore.Inserir(new No(23));
        //arvore.Inserir(new No(3));
        //arvore.Inserir(new No(32));
        //arvore.Inserir(new No(31));
        //arvore.Inserir(new No(57));
        //arvore.Inserir(new No(67));
        //arvore.Inserir(new No(65));
        //arvore.Inserir(new No(77));
        //arvore.Inserir(new No(35));
        arvore.printarArvore();
        arvore.orderSemRecursividade(arvore.raiz);
        //System.out.println("Número de nós: " + arvore.contarNos(arvore.raiz));
        //System.out.println("Número de nós não-folha: " + arvore.contarNosNaoFolha(arvore.raiz));
        //System.out.println("Número de folhas: " + arvore.contarFolhas(arvore.raiz));
        System.out.println("Altura da árvore: " + arvore.calculaAltura());
        //arvore.removerPares(arvore.raiz);
        //arvore.espelhaArvore();
        //arvore.printarArvore();

        //System.out.println("Questão número 8: Resposta --> Letra C e E\n");
        //System.out.println("Justificando -> A sequência de nós acessados 925, 202, 911, 240, 912, 245, 363 é inválida, pois o nó 912 não é acessado após o nó 240. Por ser uma árvore binária, o nó 912 estará inserido à direita do nó 911 e não à esquerda, então para acessarmos o nó 363, essa é uma sequência inválida.\n"); 
        //System.out.println("Justificando -> A sequência de nós acessados 925; 202; 911; 240; 912; 245; 363 é inválida porque o nó 912 não pode ser acessado após o nó 240. Em uma árvore binária, o nó 912 deve estar inserido à direita do nó 911 e não à esquerda. Portanto, para acessarmos o nó 363, essa sequência é inválida.");
    }
}