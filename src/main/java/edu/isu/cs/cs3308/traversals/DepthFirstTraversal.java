// Edited by - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// DepthFirstTraversal -
package edu.isu.cs.cs3308.traversals;

import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.Tree;
import java.util.ArrayList;
import java.util.List;

public class DepthFirstTraversal<E> extends AbstractTraversal<E> {

    public Tree<E> newTree;
    public DepthFirstTraversal(){

    }
    List<Node<E>> list = new ArrayList<>();
    public void subTree(Node<E> node, List<Node<E>> list){
        return;
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
    public Iterable<Node> traverseFrom(Node node) {
        return super.traverseFrom(node);
    }


    public List<Node<E>> subTreeTraverse(Node<E> currentNode){
        List<Node<E>> list = new ArrayList<>();
        if(newTree != null)
            subTree( currentNode, list);
        return null;
    }

}
