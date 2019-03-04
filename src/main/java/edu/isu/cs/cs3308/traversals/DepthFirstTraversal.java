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
    public DepthFirstTraversal(Tree<E> tree){
        newTree = tree;
    }
    /**
     * Do this
     * @return
     */
    @Override
    public Iterable<Node<E>> traverse() {
        return null;
    }

    /**
     * And this
     * @param node
     * @return
     */
    @Override
    public Iterable<Node> traverseFrom(Node node) {
        return null;
    }

}
