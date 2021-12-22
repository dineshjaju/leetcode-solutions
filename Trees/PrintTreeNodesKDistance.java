public class PrintTreeNodesKDistance {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.leftNode = new Tree(20);
        root.leftNode.leftNode = new Tree(40);
        root.leftNode.rightNode = new Tree(50);

        Tree right = new Tree(30);
        right.rightNode = new Tree(70);
        root.rightNode = right;

        printNodesAtKDistance(root ,2 );
    }

    private static void printNodesAtKDistance(Tree root, int k)
    {
        if(root != null)
        {
            if(k == 0) {
                System.out.print(root.data + " ");
            }
            printNodesAtKDistance(root.leftNode , k-1);
            printNodesAtKDistance(root.rightNode , k -1);
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
