public class Tree {

    Nodo root;


    public Tree(int num) {
        this.root.setNum(num);
    }


    public void addNodo(int num){

        Nodo nodo = new Nodo(num);

        addNodoRecursivo(root,nodo);

    }


    public void addNodoRecursivo(Nodo nodoRaiz, Nodo addNodo){


        if(nodoRaiz.getNum()>addNodo.getNum()){

            
        }
    }
}
