package binary_trees.redblack_tree;
public class TreeMain {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        // Вставка элементов в дерево
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        // Поиск элементов в дереве
        System.out.println(tree.search(10)); // Выводит: true
        System.out.println(tree.search(20)); // Выводит: false
    }
}