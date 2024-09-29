public class Pilha {
    Celula topo;
    int quantos;

    public Pilha() {
        topo = null;
        quantos = 0;
    }

    public boolean vazia() {
        return (topo == null);
    }

    public void empilhar(Celula elemento) {
        elemento.prox = topo;
        topo = elemento;
        quantos++;
    }

    public Celula desempilhar() {
        if (vazia()) {
            System.out.println("PILHA VAZIA");
            return null;
        } else {
            Celula aux = topo;
            topo = topo.prox;
            aux.prox = null;
            quantos--;
            return aux;
        }
    }

    public void esvaziar() {
        topo = null;
    }
}
