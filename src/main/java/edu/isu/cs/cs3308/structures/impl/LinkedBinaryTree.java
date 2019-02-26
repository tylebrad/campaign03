// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
//
package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.BinaryTree;
import edu.isu.cs.cs3308.structures.Node;

public class LinkedBinaryTree<E> implements BinaryTree<E> {
    /**
     * Nested Class for BinaryTreeNode with a root and two children.
     * Two constructors; First to set item, and set nodes to null; Other to set all
     */
    public static class BinaryTreeNode<E> implements Node<E>{
        private E element;
        private BinaryTreeNode<E> root, left, right;

        public BinaryTreeNode(E item){
            element = item;
            root = null;
            left = null;
            right = null;
        }

        public BinaryTreeNode(E item, BinaryTreeNode<E> parent, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild){
            element = item;
            root = parent;
            left = leftChild;
            right = rightChild;

        }

        @Override
        public E getElement() {
            return element;
        }

        @Override
        public void setElement(E element) throws IllegalArgumentException {

        }

        @Override
        public Node<E> getParent() {
            return root;
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
