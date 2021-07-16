package algorithms.LinkedList;



public class LinkedListA {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){ data = d; next = null; }
    }

    //
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /*public static void insertAfter(Node prev_node, int new_data){
        if(prev_node == null){
            System.out.println("Prev not null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }*/

    public void printList() {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListA list = new LinkedListA();
        list.push(1);
        list.push(11);
        list.push(9);


        list.printList();
    }
}
