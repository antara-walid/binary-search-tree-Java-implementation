package org.example;

public class Node {
    private int data;
    private Node left;
    private Node right;

    // constructor
    public Node(int data) {
        this.data = data;
    }

    //methods
    //1.insert
    public void insert(int data) {
        if (data < this.data) {
            //inser in left
            if (left == null)
                left = new Node(data);
            else
                left.insert(data);
        } else {
            //insert in right
            if (right == null)
                right = new Node(data);
            else
                right.insert(data);
        }

    }

    //2.contains
    public boolean contains(int data) {
        if (this.data == data)
            return true;
        else {
            if (data < this.data) {
                if (left == null)
                    return false;
                return left.contains(data);
            } else {
                if (right == null)
                    return false;
                return right.contains(data);
            }

        }
    }
    //3.in-orderPrint
    public void inOrderPrint()
    {
        if(left != null)
            left.inOrderPrint();
        System.out.println(this.data);
        if(right != null)
            right.inOrderPrint();

    }
}
