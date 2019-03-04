// Author - Bradley Tyler
// CS 3308 - Campaign 03
// Instructor - Isaac Griffith
// LinkedBinary Tree Class implementing Binary Tree and Tree
package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.BinaryTree;
import edu.isu.cs.cs3308.structures.Node;
import edu.isu.cs.cs3308.structures.Tree;

public class LinkedBinaryTree<E> implements BinaryTree<E>, Tree<E> {
    // Nested BinaryTreeNode<E> Class
    public static class BinaryTreeNode<E> implements Node<E> {
        public E element;
        public BinaryTreeNode<E> parent, left, right;

        public BinaryTreeNode(E item, BinaryTreeNode<E> above, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild) {
            element = item;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
        // Access Methods
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

        // Update Methods
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

    // Class global variables
    public BinaryTreeNode<E> root = null;
    private int size = 0;
    public LinkedBinaryTree() {}

    // Methods

    // Creates a BinaryTreeNode
    public BinaryTreeNode<E> createNode(E e, BinaryTreeNode<E> parent, BinaryTreeNode left, BinaryTreeNode<E> right){
        return new BinaryTreeNode<>(e, parent, left, right);
    }

    // Returns root of tree, or null if empty
    @Override
    public Node<E> root() {
        if(isEmpty())
            return null;
        else
            return root;
    }

    // Creates a new root with given item, unless null or the same root;
    @Override
    public Node<E> setRoot(E item) {
        BinaryTreeNode<E> newRoot = new BinaryTreeNode(item, null, null, null);
        if(item == null || item == root.element)
            return null;
        else
            root = newRoot;
        size++;
        return root;
    }

    /**
     * Inserts the item into the tree under the provided node. If the provided
     * node is null the item becomes the new root of the tree, beware.
     *
     * @param item Item to be inserted into the tree.
     * @param p The parent node of the tree, if null the item becomes the new
     * root so beware.
     * @return True if the item was able to be inserted, false otherwise (for
     * example the item was null)
     * @throws IllegalArgumentException if the provided parent node is invalid,
     * or the provided value is null.
     */

    // Inserts given item into the tree, UNDER the provided node.
    // If the provided node is null, the item becomes the new root.
    @Override
    public Node<E> insert(E item, Node<E> p) {
        //if(item == null)
            //throw IllegalArgumentException;
        return null;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
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

    @Override
    public Node<E> parent(Node<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Iterable<Node<E>> children(Node<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public int numChildren(Node<E> p) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public boolean isInternal(Node<E> p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isExternal(Node<E> p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isRoot(Node<E> p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean remove(E item, Node<E> p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public E set(Node<E> node, E element) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Node<E> validate(Node<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public int depth(Node<E> node) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public int subTreeSize(Node<E> node) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public boolean isLastChild(Node<E> node) throws IllegalArgumentException {
        return false;
    }
}
