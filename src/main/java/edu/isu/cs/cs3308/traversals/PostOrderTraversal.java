package edu.isu.cs.cs3308.traversals;

import edu.isu.cs.cs3308.structures.Tree;
import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal<E> extends DepthFirstTraversal<E> {
    public Tree<E> newTree;
    public PostOrderTraversal(Tree<E> tree){
        newTree = tree;
    }
}
