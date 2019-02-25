// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
//
package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.BinaryTree;
import edu.isu.cs.cs3308.structures.Node;

public class LinkedBinaryTree<E> implements BinaryTree<E> {
    /**
     * Nested Class for BinaryTreeNode with a left and right child
     */
    public static class BinaryTreeNode<E> implements Node<E>{

        private E element;
        private BinaryTreeNode<E> left, right;

        public BinaryTreeNode(E item){
            element = item;
            left = null;
            right = null;
        }

        public BinaryTreeNode(E item, LinkedBinaryTree<E> left, LinkedBinaryTree<E> right){
            element = item;
            if (left == null)
                this.left = null;
            else
                this.left = left.getRootNode();
        }
        @Override
        public E getElement() {
            return null;
        }

        @Override
        public void setElement(E element) throws IllegalArgumentException {

        }

        @Override
        public Node<E> getParent() {
            return null;
        }
    }
    public LinkedBinaryTree() {
        super();
    }

    @Override
    public Node left(Node p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Node right(Node p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Node sibling(Node p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Node addLeft(Node p, Object element) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Node addRight(Node p, Object element) throws IllegalArgumentException {
        return null;
    }
}
