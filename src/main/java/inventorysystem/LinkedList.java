/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author LoneDespair
 */
public class LinkedList {
    
    // Do not delete the head
    Node head = new Node();
    
    public static class Node {
        Node next = this;
        Node prev = this;
        
        Data data;
        
        public Node() {}
        
        public Node(Node newNext) {
            next = newNext;
        }
        
    }
    
    public static class Data {}
    
    
    // Inserts a node after a specified node
    public void insert(Node prev, Node target) {
        
        
    }
    
    public void delete(Node node) {
        if (node == head) {
            System.out.println("what chu doing oni chan!\n do not delete head node");
        }
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    
    
}




