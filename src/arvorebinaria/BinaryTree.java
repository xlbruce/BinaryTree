package arvorebinaria;

/**
 *
 * @author 31409695
 */
public class BinaryTree<E> {

    private Node<E> root; // raiz da árvore   

    BinaryTree() {
        // Cria uma árvore binária vazia 
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRoot(Node<E> e) throws Exception {
        if(root != null) {
            throw new Exception("Árvore já possui raíz");
        }
        root = e;
    }

    public Node<E> root() {
        return root;
    }

    public boolean isRoot(Node<E> n) {
        return n.getParent() == null;
    }

    public boolean isInternal(Node<E> n) {
        return n.getLeft() != null || n.getRight() != null;
    }

    public boolean isLeaf(Node<E> n) {
        return n.getLeft() == null && n.getRight() == null;
    }

    public void addLeft(Node<E> n, Node<E> m) throws Exception {
        if(n.getLeft() != null) {
            throw new Exception("Nó esquerdo já definido");
        }
        n.setLeft(m);
        m.setParent(n);
    }

    public Node<E> left(Node<E> n) throws Exception {
        if(n.getLeft() == null) {
            throw new Exception("Não há nó esquerdo");
        }
        return n.getLeft();
    }

    public boolean hasLeft(Node<E> n) {
        return n.getLeft() != null;
    }

    public void addRight(Node<E> n, Node<E> m) throws Exception {
        if(n.getRight() != null) {
            throw new Exception("O nó já possui um filho do lado direito");
        }
        n.setRight(m);
        m.setParent(n);
    }

    public Node<E> right(Node<E> n) throws Exception {
        if(n.getRight() == null) {
            throw new Exception("Não há nó direito");
        }
        return n.getRight();

    }

    public boolean hasRight(Node<E> n) {
        return n.getRight() != null;

    }

    public void remove(Node<E> n) {
        n.setLeft(null);
        n.setRight(null);

    }

}
