// Edited by - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// AbstractTraversal -
package edu.isu.cs.cs3308.traversals;

import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.traversals.commands.TraversalCommand;

public class AbstractTraversal<E> implements TreeTraversal<E> {

    @Override
    public Iterable<Node<E>> traverse() {
        return null;
    }

    @Override
    public Iterable<Node<E>> traverseFrom(Node node) {
        return null;
    }

    /**
     * Do this one
     * @param cmd The new executable command
     */
    @Override
    public void setCommand(TraversalCommand cmd) {

    }
}