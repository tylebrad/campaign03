// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// PreOrderTraversal
package edu.isu.cs.cs3308.traversals;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.Tree;
import edu.isu.cs.cs3308.structures.impl.LinkedBinaryTree;

public class PreOrderTraversal<E> extends DepthFirstTraversal<E>{
    public Tree<E> newTree;
    public PreOrderTraversal(Tree<E> tree){
        newTree = tree;
    }

    public PreOrderTraversal() {}

    @Override
    public void subtree(Node<E> node, List<Node<E>> list) {
        ArrayList<Node<E>> tempList = new ArrayList<>();
        tempList.add(node);
        //Dumb bullshit to get this to work
        LinkedBinaryTree.BinaryTreeNode<E> tempNode = (LinkedBinaryTree.BinaryTreeNode<E>)node;
        if (tempNode.left != null)
            subtree(tempNode.left, list);
        if (tempNode.right != null)
            subtree(tempNode.left, list);
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
}
