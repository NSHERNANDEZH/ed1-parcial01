package ed.lab;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        //si

        // Llamar recursivamente para aplanar los subárboles izquierdo y derecho
        flatten(root.left);
        flatten(root.right);

        // Guardar el subárbol derecho
        TreeNode<Integer> temp = root.right;

        // Mover el subárbol izquierdo a la derecha
        root.right = root.left;
        root.left = null;

        // Recorrer hasta el último nodo del subárbol derecho actual
        TreeNode<Integer> current = root;
        while (current.right != null) {
            current = current.right; // Avanzar al siguiente nodo
        }

        // Adjuntar el subárbol derecho guardado
        current.right = temp;
    }
}
