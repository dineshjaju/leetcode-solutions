import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfTree {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.leftNode = new Tree(20);
        root.leftNode.leftNode = new Tree(40);
        root.leftNode.rightNode = new Tree(50);

        Tree right = new Tree(30);
        right.rightNode = new Tree(70);
        root.rightNode = right;

        rightViewOfTree(root);
    }

    public static void rightViewOfTree(Tree input) {
        if (input == null) {
            return;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(input);

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0 ; i< size;i++)
            {
                Tree currentNode = queue.poll();
                if(currentNode != null)
                {
                    if(i == size - 1) {
                        System.out.println(currentNode.data);
                    }
                    if(currentNode.leftNode != null) {
                        queue.add(currentNode.leftNode);
                    }

                    if(currentNode.rightNode != null) {
                        queue.add(currentNode.rightNode);
                    }
                }
            }
        }

    }

    static class Tree {
        protected final int data;
        protected Tree leftNode;
        protected Tree rightNode;

        public Tree(int data) {
            this.data = data;
            this.leftNode = this.rightNode = null;
        }
    }
}
