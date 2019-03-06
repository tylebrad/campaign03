// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// BreadthFirstTraversal -
package edu.isu.cs.cs3308.traversals;

import java.util.*;
import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.impl.LinkedBinaryTree;
import edu.isu.cs.cs3308.structures.Tree;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstTraversal<E> extends AbstractTraversal<E>{

    Tree<E> test;
    public BreadthFirstTraversal(Tree<E> tree){
        test = tree;
    }
    /**
     * Do this
     * @return
     */
    @Override
    public Iterable<Node<E>> traverse() {
        traverseFrom(test.root());
        return null;
    }

    /**
     * And this
     * @param node
     * @return
     */
    @Override
    public Iterable<Node<E>> traverseFrom(Node node) {
        List<LinkedBinaryTree.BinaryTreeNode<E>> snapshot = new ArrayList<>();
        Queue<LinkedBinaryTree.BinaryTreeNode<E>> queue = new LinkedBlockingQueue<>();
        while (queue.isEmpty()){
            LinkedBinaryTree.BinaryTreeNode<E> tempNode = queue.poll();
            snapshot.add(tempNode);
            if (tempNode.left != null)
                queue.offer(tempNode.left);
            if (tempNode.right != null)
                queue.offer(tempNode.right);
        }
        return super.traverseFrom(node);
    }
}
