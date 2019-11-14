public class Nodo {


    int num;
    Nodo left;
    Nodo right;

    public Nodo(int num) {
        this.num = num;
    }

    public Nodo() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "num=" + num +
                '}';
    }
}
