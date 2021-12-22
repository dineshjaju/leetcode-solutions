public class HeightOfTree {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.leftNode = new Tree(20);
        root.leftNode.leftNode = new Tree(40);
        root.leftNode.rightNode = new Tree(50);

        Tree right = new Tree(30);
        right.rightNode = new Tree(70);
        root.rightNode = right;

        System.out.println(heightOfTree(root));
    }

    public static int heightOfTree(Tree currentNode)
    {
        if(currentNode == null) {
            return 0;
        }

        return Math.max(heightOfTree(currentNode.leftNode) , heightOfTree(currentNode.rightNode)) +1;
    }

    private static class Tree {
        public int data;
        public Tree leftNode;
        public Tree rightNode;

        public Tree(int data) {
            this.data = data;
            this.leftNode = this.rightNode = null;
        }
    }
}
