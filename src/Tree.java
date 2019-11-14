public class Tree {

    Nodo root;


    public Tree() {
    }

    public Tree(int num) {
        this.root = new Nodo(num);
    }


    public void addNodo(int num) {

        Nodo nodo = new Nodo(num);

        if (root == null) {
            root = nodo;
        }

        addNodoRecursivo(root, nodo);

    }


    private void addNodoRecursivo(Nodo nodoRaiz, Nodo addNodo) {


        if (nodoRaiz.getNum() > addNodo.getNum()) {

            if (nodoRaiz.left != null) {

                addNodoRecursivo(nodoRaiz.left, addNodo);
            } else {

                nodoRaiz.left = addNodo;
                return;
            }


        } else if (nodoRaiz.getNum() < addNodo.getNum()) {

            if (nodoRaiz.right != null) {

                addNodoRecursivo(nodoRaiz.right, addNodo);

            } else {

                nodoRaiz.right = addNodo;
                return;
            }


        }
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root.getNum() +
                '}';
    }
}
