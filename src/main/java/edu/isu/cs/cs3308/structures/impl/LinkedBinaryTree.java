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

        // Child Node Constructor
        public BinaryTreeNode(E item, BinaryTreeNode<E> above, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild) {
            element = item;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
        // Root constructor
        public BinaryTreeNode(E item, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild){
            element = item;
            left = leftChild;
            right = rightChild;
        }
        // Access Methods
        @Override
        public E getElement() {
            return element;
        }
        @Override
        public BinaryTreeNode<E> getParent() {
            return this.parent;
        }
        public BinaryTreeNode<E> getLeft() {
            return this.left;
        }
        public BinaryTreeNode<E> getRight() {
            return this.right;
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
    public int size = 0;
    public LinkedBinaryTree() {}

    // Methods

    // Creates a BinaryTreeNode
    public BinaryTreeNode<E> createNode(E e, BinaryTreeNode<E> parent, BinaryTreeNode<E> left, BinaryTreeNode<E> right)
    throws IllegalArgumentException
    {
        if (e == null)
            throw new IllegalArgumentException();

        return new BinaryTreeNode<E>(e, parent, left, right);
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
        BinaryTreeNode<E> newRoot = new BinaryTreeNode(item, null, null);
        if(item == null)
            return null;
        else
            this.root = newRoot;
            size = 1;
        return newRoot;
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
    public Node<E> insert(E item, Node<E> p) throws IllegalArgumentException {
        BinaryTreeNode<E> node = (BinaryTreeNode<E>)validate(p);
        if(item == null )
            throw new IllegalArgumentException();
        if(p == null)
            setRoot(item);
        return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    // Returns left node of provided parent Node
    @Override
    public Node<E> left(Node<E> p) throws IllegalArgumentException {
        BinaryTreeNode<E> node = (BinaryTreeNode<E>)validate(p);
        return node.getLeft();
    }

    // Returns right node of the provided parent Node
    @Override
    public Node<E> right(Node<E> p) throws IllegalArgumentException {
        BinaryTreeNode<E> node = (BinaryTreeNode<E>)validate(p);
        return node.getRight();
    }

    // Returns the sibling node of a given child Node
    @Override
    public Node<E> sibling(Node<E> p) throws IllegalArgumentException {
        BinaryTreeNode<E> node = (BinaryTreeNode<E>)validate(p);
        return null;
    }


    @Override
    public Node<E> addLeft(Node<E> p, E element) throws IllegalArgumentException {
        BinaryTreeNode<E> parent = (BinaryTreeNode<E>) validate(p);
        if(parent.getLeft() != null)
            throw new IllegalArgumentException();
        BinaryTreeNode<E> child = createNode(element, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
    }

    @Override
    public Node<E> addRight(Node<E> p, E element) throws IllegalArgumentException {
        BinaryTreeNode<E> parent = (BinaryTreeNode<E>) validate(p);
        if(parent.getRight() != null)
            throw new IllegalArgumentException();
        BinaryTreeNode<E> child = createNode(element, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
    }

    // Returns the position of p's parent or null if p is root
    @Override
    public Node<E> parent(Node<E> p) throws IllegalArgumentException {
        BinaryTreeNode<E> node = (BinaryTreeNode<E>)validate(p);
        return node.getParent();
    }

    @Override
    public Iterable<Node<E>> children(Node<E> p) throws IllegalArgumentException {
        return null;
    }

    // Returns number of children of the provided parent Node
    @Override
    public int numChildren(Node<E> p) throws IllegalArgumentException {
        BinaryTreeNode<E> node = (BinaryTreeNode<E>) validate(p);
        int num = 0;
        if(right(p) != null)
            num++;
        if(left(p) != null)
            num++;
        return num;
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
        BinaryTreeNode<E> newNode = (BinaryTreeNode<E>)validate(p);
        if (p.getParent() == null)
            return true;
        return false;
    }

    // Removes given item at given Node
    @Override
    public boolean remove(E item, Node<E> p) throws IllegalArgumentException {
        if(p == null){
            return false;
        }
        BinaryTreeNode<E> node = (BinaryTreeNode<E>) validate(p);
        if(numChildren(p) == 2)
            throw new IllegalArgumentException();
        BinaryTreeNode<E> child = node.getLeft() != null ? node.getLeft() : node.getRight();
        if (child != null)
            child.setParent(node.getParent());
        if (node == root)
            root = child;
        else {
            BinaryTreeNode<E> parent = node.getParent();
            if (node == parent.getLeft())
                parent.setLeft(child);
            else
                parent.setRight(child);
        }
        size--;
        return true;
    }

    @Override
    public E set(Node<E> node, E element) throws IllegalArgumentException {
        if (node == null || element == null)
            throw new IllegalArgumentException();
        BinaryTreeNode<E> newNode = (BinaryTreeNode<E>)validate(node);
        E temp = newNode.getElement();
        newNode.setElement(element);
        return temp;
    }

    // Validates the position and returns it as a node
    @Override
    public Node<E> validate(Node<E> p) throws IllegalArgumentException {
        if(this.root == null)
            throw new IllegalArgumentException();
        if(!(p instanceof BinaryTreeNode))
            throw new IllegalArgumentException();
        BinaryTreeNode<E> node = (BinaryTreeNode<E>) p;
        if(node.getParent() == node)
            throw new IllegalArgumentException();
        return node;
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
