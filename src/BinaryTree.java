import java.util.Stack;
/*

Referencias:
https://www.geeksforgeeks.org/binary-tree-data-structure/
https://www.sanfoundry.com/java-program-implement-binary-tree/
https://www.youtube.com/watch?v=22AE6WklXBg
https://www.youtube.com/watch?v=X2XcDn8TPwU
https://devs4j.com/2017/11/15/arboles-binarios-en-java/

 */

public class BinaryTree<E>
{
    protected E val; // valor del nodo
    protected BinaryTree<E> parent; // el papa del nodo
    protected BinaryTree<E> left, right; // hijo del nodo

    public BinaryTree()
    {
        //se crea el nodo vacio
        val = null;
        parent = null; left = right = this;
    }
    public BinaryTree(E value)
    {
        //devuelve un valor de referencia de árbol y dos subárboles vacíos
        val = value;
        right = left = null;

    }
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
    {
        //devuelve un valor de referencia de árbol y dos subárboles
        val = value;
        if (left == null) { left = new BinaryTree<E>(); }
        setLeft(left);
        if (right == null) { right = new BinaryTree<E>(); }
        setRight(right);
    }
    public void setLeft(BinaryTree<E> newLeft)
    {
        //establece el subárbol izquierdo en "newleft""
        if (isEmpty()) return;
        if (left != null && left.parent == this) left.setParent(null); // si no es nulo si lo re parenta
        left = newLeft;
        left.setParent(this);
    }
    public void setRight(BinaryTree<E> newRight)
    {
        //establece subárbol izquierdo a newRight
        if (isEmpty()) return;
        if (right != null && right.parent == this) right.setParent(null);//si no esta vacio lo re ingresa
        right = newRight;
        right.setParent(this);
    }
    protected void setParent(BinaryTree<E> newParent)
    {
        //re-parenta este nodo a referencia primaria, o null
        if (!isEmpty()) {
            parent = newParent;
        }
    }
    public BinaryTree<E> left()
    {
        //devuelve referencia a (posiblemente vacío) subárbol izquierdo
        return left;
    }
    public E value()
    {
        //retorna el valor asociado con este nodo
        return val;
    }
    public void setValue(E value)
    {
        //setea el valor asociado con este nodo
        val = value;
    }
    public boolean isEmpty(){
        if (parent == null & right ==  null & left == null || val == null){
            return true;
        }
        return false;
    }


}