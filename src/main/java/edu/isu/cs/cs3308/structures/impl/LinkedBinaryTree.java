// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
//
package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.BinaryTree;
import edu.isu.cs.cs3308.structures.Node;

public class LinkedBinaryTree<E> implements BinaryTree<E> {

    /**
     * Nested Class for the LinkedBinaryTree's Nodes
     */
    public static class BinaryTreeNode<E> implements Node<E> {
        public E element;
        public BinaryTreeNode<E> parent, left, right;

        public BinaryTreeNode(E item, BinaryTreeNode<E> above, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild) {
            element = item;
            parent = above;
            left = leftChild;
            right = rightChild;

        }
        //  Access Methods
        @Override
        public E getElement() {
            return element;
        }

        @Override
        public Node<E> getParent() {
            return parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public Node<E> getRight() {
            return right;
        }

        //  Update Methods
        @Override
        public void setElement(E element) throws IllegalArgumentException {
            this.element = element;
        }

        public void setParent(BinaryTreeNode<E> parentNode) {
            parent = parentNode;
        }

        public void setLeft(BinaryTreeNode<E> leftChild) {
            left = leftChild;
        }

        public void setRight(BinaryTreeNode<E> rightChild) {
            right = rightChild;
        }
    }

    /**
     * LinkedBinaryTree variables
     */
    public BinaryTreeNode<E> root = null;
    private int size = 0;
    public LinkedBinaryTree() {}

    /**
     * Methods
     */
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public BinaryTreeNode<E> createNode(E e, BinaryTreeNode<E> parent, BinaryTreeNode left, BinaryTreeNode<E> right){
        return new BinaryTreeNode<>(e, parent, left, right);
    }
    public void setRoot(){
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
