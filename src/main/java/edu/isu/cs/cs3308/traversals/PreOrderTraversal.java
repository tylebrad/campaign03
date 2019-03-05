// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// PreOrderTraversal
package edu.isu.cs.cs3308.traversals;
import java.util.ArrayList;
import java.util.List;

import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.Tree;

public class PreOrderTraversal<E> extends DepthFirstTraversal<E>{
    public Tree<E> newTree;
    public PreOrderTraversal(Tree<E> tree){
        newTree = tree;
    }

    public PreOrderTraversal() {
        super();
    }

    @Override
    public void subtree(Node<E> node, List<Node<E>> list) {
        super.subtree(node, list);
    }

    @Override
    public Iterable<Node<E>> traverse() {
        return super.traverse();
    }

    @Override
    public Iterable<Node> traverseFrom(Node node) {
        return super.traverseFrom(node);
    }

    @Override
    public List<Node<E>> subTreeTraverse(Node<E> currentNode) {
        return super.subTreeTraverse(currentNode);
    }
}
