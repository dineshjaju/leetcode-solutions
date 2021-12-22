public class InOrderTraversal {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.leftNode = new Tree(20);
        root.leftNode.leftNode = new Tree(40);
        root.leftNode.rightNode = new Tree(50);

        Tree right = new Tree(30);
        right.rightNode = new Tree(70);
        root.rightNode = right;

        performInOrderTraversal(root);
    }

    public static void performInOrderTraversal(Tree currentNode) {
        if (currentNode == null) {
            return;
        }

        if (currentNode.leftNode != null) {
            performInOrderTraversal(currentNode.leftNode);
        }
        System.out.println(currentNode.data);

        if (currentNode.rightNode != null) {
            performInOrderTraversal(currentNode.rightNode);
        }
    }

    private static class Tree {
        public final int data;
        public Tree leftNode;
        public Tree rightNode;

        public Tree(int data) {
            this.data = data;
            this.leftNode = this.rightNode = null;
        }
    }
}
