// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// BreadthFirstTraversal -
package edu.isu.cs.cs3308.traversals;

import java.util.List;
import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.impl.LinkedBinaryTree;
import edu.isu.cs.cs3308.structures.Tree;
import java.util.ArrayList;
import java.util.List;

public class BreadthFirstTraversal<E> extends AbstractTraversal<E>{

    public void enqueue(Node<E> node, List<Node<E>> queue) {
        queue.add(node);
    }

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
        return super.traverse();
    }

    /**
     * And this
     * @param node
     * @return
     */
    @Override
    public Iterable<Node> traverseFrom(Node node) {
        return super.traverseFrom(node);
    }
}
