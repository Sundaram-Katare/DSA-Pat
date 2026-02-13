package SingleLinkedList;

class Node{
    int val;
    Node next;
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    Node(int val){
        this.val = val;
    }

    //Insert First
    public static Node insertFirst(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        int i=2;
        while (i < 6) {
            Node node = new Node(i);
            temp.next = node;
            temp = temp.next;
            i++;
        }

        display(head);
        display(insertFirst(head, 8));
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

