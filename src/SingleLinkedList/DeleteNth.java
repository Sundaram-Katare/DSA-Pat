package SingleLinkedList;

public class DeleteNth {
    public static Node delete(Node head, int n) {
        Node dummy = new Node(-1);

        dummy.next = head;

        Node p = dummy;
        Node q = dummy;

        for(int i=0; i<= n; i++) {
            p = p.next;
        }

        while (p != null) {
            p = p.next;
            q = q.next;
        }

        q.next = q.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);

        System.out.println();

        System.out.println("After deletion");

        delete(head, 4);

        printList(head);


    }

    public static void printList(Node head) {
        Node temp =head;

        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
    }
}
