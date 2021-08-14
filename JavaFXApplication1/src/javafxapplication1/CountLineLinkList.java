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

public class CountLineLinkList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int filename; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            filename = d; 
            next = null; 
        } 
    } 
  

    public  CountLineLinkList insert(CountLineLinkList list, int data) 
    { 
        
        Node new_node = new Node(data); 
        new_node.next = null; 
  
      
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            
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
    public static void printList(CountLineLinkList list) 
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
