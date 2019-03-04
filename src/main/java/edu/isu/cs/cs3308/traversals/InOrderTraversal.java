// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// InOrderTraversal -
package edu.isu.cs.cs3308.traversals;

import edu.isu.cs.cs3308.structures.Tree;
import edu.isu.cs.cs3308.structures.Node;
import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal<E> extends DepthFirstTraversal<E>{
    Tree<E> newTree;
    InOrderTraversal(Tree<E> tree){
        newTree = tree;
    }
    /**
     * Do this
     */
    List<Node<E>> list = new ArrayList<>();
    public void subTree(Node<E> node, List<Node<E>> list){
    }
}
