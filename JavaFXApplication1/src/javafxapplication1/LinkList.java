/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Aman
 */

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        String filename; 
        Node next; 
  
        // Constructor 
        Node(String d) 
        { 
            filename = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public  LinkList insert(LinkList list, String data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.filename + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
  
}











//public class LinkList {
//      
//      Node head;
//      String fileName;
//    public LinkList() {
//        head = null;
//    }
//      public LinkList( String fileName) {
//        head = null;
//        setTextFileName(fileName);
//        
//        }
//        public String getTextFileName() {
//        return fileName;
//    }
//
//    public void setTextFileName(String fileName) {
//        this.fileName = fileName;
//    
//    }
//    
//    
//    public void insertAtHead(String val){
//        Node objNode;
//         objNode = new Node(val);
//         objNode.setNext(head);
//         head = objNode;
//        
//    }
//    
//    public void traverse(){
//        Node move = head;
//        while(move != null){
//            
//            System.out.println("Current name " + move.getNext());
//            move = move.getNext();
//        }
//        
//    }
//    
//    public void insertAtEnd(String val){
//         Node move = head;
//     if(head != null){
//        while(move.getNext() != null){
//            
//            
//            move = move.getNext();
//        }
//            Node objNode = new Node(val);
//            move.setNext(objNode);
//     }else{
//            insertAtEnd(val);
//          }
//    }
//    
//  /*  public void insertBefore(Node beforeNode, int value) 
//    { 
//   
//            if (beforeNode == null) 
//            { 
//                System.out.println("previous node is null"); 
//
//
//            } 
//
//                    Node newNode = new Node(value); 
//                    newNode.next = beforeNode.next;  
//                    beforeNode.next = newNode.next; 
//
//     }*/
//    
//    public void deleteAtHead(){
//        if( head!= null){
//            Node temp = head;
//            head = head.getNext();
//            temp.setNext(null);
//           
//        }else{
//            System.out.println("Deletation not posible");
//        }
//    }
//    
//    
//    public void deleteAtEnd() {
//    Node tail = null;
//        if (head == null) {
//    }
//    if (head == tail) {
//        head = null;
//        tail = null;
//    } else {
//        Node current = head;
//        while (current.getNext() != tail) {
//            current = current.getNext();
//        }
//        current.setNext(null);
//        tail = current;
//    }
//}
//    
//    
//    
//    
//     public void deleteAllList() 
//    { 
//        head = null; 
//    }
//
//    void printList(){
//		Node temp = head ;
//		while(temp != null){
//			System.out.println( temp.getData() + "\t");
//			temp = temp.getNext();
//		}
//    }
//    public boolean searchInLinkList(Node head, String value) 
//    { 
//        Node CurrentNode = head;   //first i iinitialize
//        while (CurrentNode != null) 
//        { 
//            if (CurrentNode.getData() == value){ 
//                return true;    
//             
//            }
//            CurrentNode = CurrentNode.getNext();
//        } 
//        return false;    
//    
//    
//   }
//}
