import org.w3c.dom.Node;

public class ABB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
    }

    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }


   public boolean contains(int element) {
    return contains(this.raiz, element);
    }

private boolean contains(Noh node, int element) {
    if (node == null) {
        return false;
    }
    if (element == node.valor) {
        return true;
    }
    if (element < node.valor) {
        return contains(node.esq, element);
    } else {
        return contains(node.dir, element);
    }
}

}
