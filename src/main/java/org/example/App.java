package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Node node = new Node(6);

        node.insert(4);
        node.insert(8);
        node.insert(1);
        node.insert(5);
        System.out.println(node.contains(1));
        System.out.println(node.contains(9));

        node.inOrderPrint();
    }
}
