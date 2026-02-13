package SingleLinkedList;

public class DeleteInDLL {
    static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void delete(Node head, int data) {

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.prev = null;
        head.next = new Node(2);
        head.next.prev = head;

        display(head);
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp.next != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }

        System.out.println(temp.val);
    }
}
