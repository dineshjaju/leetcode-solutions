import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        LevelOrderTraversal.Tree root = new LevelOrderTraversal.Tree(10);
        root.leftNode = new Tree(20);
        root.leftNode.leftNode = new Tree(40);
        root.leftNode.rightNode = new Tree(50);

        Tree right = new Tree(30);
        right.rightNode = new Tree(70);
        root.rightNode = right;

        performLevelOrderTraversal(root);
    }

    public static void performLevelOrderTraversal(Tree currentNode) {
        if (currentNode == null) {
            return;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(currentNode);

        while(!queue.isEmpty())
        {
            Tree node = queue.poll();
            System.out.println(node.data);

            if(node.leftNode != null) {
                queue.add(node.leftNode);
            }

            if(node.rightNode != null) {
                queue.add(node.rightNode);
            }
        }

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
