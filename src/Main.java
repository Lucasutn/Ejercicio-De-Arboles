public class Main {


    public static void main(String[] args) {

    Tree tree = new Tree(4);

    tree.addNodo(2);
    tree.addNodo(1);
    tree.addNodo(3);
    tree.addNodo(5);
    tree.addNodo(10);
    tree.addNodo(9);
    tree.addNodo(11);

//        Verificacion ejercicio 1
//        System.out.println(tree);
//        System.out.println(tree.getRoot().left);
//        System.out.println(tree.getRoot().left.left);
//        System.out.println(tree.getRoot().left.right);
//        System.out.println(tree.getRoot().right);
//        System.out.println(tree.getRoot().right.right);
//        System.out.println(tree.getRoot().right.right.left);
//        System.out.println(tree.getRoot().right.right.right);


    tree.showNodes(tree.getRoot());







    }


}
