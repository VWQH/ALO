package unica.singly_linked_list;

public class Main_Linked_List {

   public static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
   }

   public static void print(Node head){
       if(head == null){
           System.out.println("List is empty!");
       }else{
           Node temp = head;
           while(temp != null){
               System.out.print(temp.value + " ");
               temp = temp.next;
           }
       }
   }

   // chèn đầu
    public static Node addToHead(Node headNode, int value){
       Node newNode = new Node(value);
//

//        if(headNode == null){
//            return newNode;
//        }else{
//            newNode.next = headNode;
//        }
//        return null;

        if(headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        Node newList = addToHead(n1, 10);
        print(newList);

    }
}
