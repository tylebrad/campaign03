// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// InOrderTraversal -
package edu.isu.cs.cs3308.traversals;

import edu.isu.cs.cs3308.structures.Tree;
import edu.isu.cs.cs3308.structures.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal<E> extends DepthFirstTraversal<E>{
    Tree<E> newTree;
    InOrderTraversal(Tree<E> tree){
        newTree = tree;
    }

    public InOrderTraversal() {
        super();
    }

    @Override
    public Iterable<Node<E>> traverse() {
        return super.traverse();
    }

    @Override
    public Iterable<Node<E>> traverseFrom(Node node) {
        return super.traverseFrom(node);
    }

    @Override
    public List<Node<E>> subTreeTraverse(Node<E> currentNode) {
        return super.subTreeTraverse(currentNode);
    }

    @Override
    public void subtree(Node<E> node, List<Node<E>> list) {
        super.subtree(node, list);
    }
}
