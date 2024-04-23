package binary_trees.redblack_tree;
class RedBlackTree {

    private Node root;
    private final Node nil;

    // Внутренний класс для представления узла дерева
    private class Node {
        int key;
        Node parent;
        Node left;
        Node right;
        boolean isRed;

        public Node(int key) {
            this.key = key;
            isRed = true;
            parent = nil;
            left = nil;
            right = nil;
        }
    }

    public RedBlackTree() {
        nil = new Node(0);
        nil.isRed = false;
        root = nil;
    }

    // Вставка нового ключа в дерево
    public void insert(int key) {
        Node newNode = new Node(key);
        Node current = root;
        Node parent = nil;

        // Находим место для вставки нового узла
        while (current != nil) {
            parent = current;

            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        newNode.parent = parent;

        // Устанавливаем связи между узлами
        if (parent == nil) {
            root = newNode;
        } else if (key < parent.key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        newNode.left = nil;
        newNode.right = nil;
        newNode.isRed = true;

        // Поддерживаем свойства красно-черного дерева после вставки
        insertFixUp(newNode);
    }

    // Восстановление свойств красно-черного дерева после вставки
    private void insertFixUp(Node node) {
        while (node.parent.isRed) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;

                if (uncle.isRed) {
                    // Случай 1: Дядя красный
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        // Случай 2: Дядя черный, узел правый ребенок
                        node = node.parent;
                        leftRotate(node);
                    }

                    // Случай 3: Дядя черный, узел левый ребенок
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rightRotate(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;

                if (uncle.isRed) {
                    // Случай 1: Дядя красный
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        // Случай 2: Дядя черный, узел левый ребенок
                        node = node.parent;
                        rightRotate(node);
                    }

                    // Случай 3: Дядя черный, узел правый ребенок
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    leftRotate(node.parent.parent);
                }
            }
        }

        root.isRed = false;
    }

    // Левый поворот узла
    private void leftRotate(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;

        if (rightChild.left != nil) {
            rightChild.left.parent = node;
        }

        rightChild.parent = node.parent;

        if (node.parent == nil) {
            root = rightChild;
        } else if (node == node.parent.left) {
            node.parent.left = rightChild;
        } else {
            node.parent.right = rightChild;
        }

        rightChild.left = node;
        node.parent = rightChild;
    }

    // Правый поворот узла
    private void rightRotate(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;

        if (leftChild.right != nil){
            leftChild.right.parent = node;
        }

        leftChild.parent = node.parent;

        if (node.parent == nil) {
            root = leftChild;
        } else if (node == node.parent.right) {
            node.parent.right = leftChild;
        } else {
            node.parent.left = leftChild;
        }

        leftChild.right = node;
        node.parent = leftChild;
    }

    // Поиск ключа в дереве
    public boolean search(int key) {
        Node current = root;

        while (current != nil) {
            if (key == current.key) {
                return true;
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }
}