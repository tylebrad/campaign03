// Edited by - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// DepthFirstTraversal -
package edu.isu.cs.cs3308.traversals;

import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.Tree;
import edu.isu.cs.cs3308.structures.impl.LinkedBinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DepthFirstTraversal<E> extends AbstractTraversal<E> {

    public Tree<E> newTree;
    public DepthFirstTraversal() {}
    List<Node<E>> list = new ArrayList<>();
    public void subtree(Node<E> node, List<Node<E>> list){
    }
    public DepthFirstTraversal(Tree<E> tree){
        newTree = tree;
    }
    /**
     * Do this
     * @return
     */
    @Override
    public Iterable<Node<E>> traverse() {
        traverseFrom(newTree.root());
        return null;
    }

    @Override
    public Iterable<Node<E>> traverseFrom(Node node) {
        subTreeTraverse(node);
        return null;
    }

    public List<Node<E>> subTreeTraverse(Node<E> currentNode){
        List<Node<E>> list = new ArrayList<>();
        if(newTree.isEmpty())
            subtree(currentNode, list);
        return list;
    }

}
