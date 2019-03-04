// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// PreOrderTraversal
package edu.isu.cs.cs3308.traversals;
import java.util.ArrayList;
import java.util.List;
import edu.isu.cs.cs3308.structures.Tree;

public class PreOrderTraversal<E> extends DepthFirstTraversal<E>{
    public Tree<E> newTree;
    public PreOrderTraversal(Tree<E> tree){
        newTree = tree;
    }
}
