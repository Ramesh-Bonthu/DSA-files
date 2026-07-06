package LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }


    public int delete(int index){
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node node = get(index-1);

        int value  = node.next.value;

        node.next = node.next.next;

        return value;
    }

    public int deleteLast(){
        if (size == 1) {
           return deleteFirst();
        }

        Node node = get(size - 2);

        int value = node.next.value;

        tail = node;
        tail.next = null;

        return value;
    }


    public Node get(int index){
        Node node = head;

        for(int i = 0; i < index; i++){
            node = node.next;
        }

        return node;
    }

    public int deleteFirst(){
        int value = head.value;
        head =  head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }
        size += 1;
    }

    public void insertLast(int value){
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertRec(int value,int index){
        head = recInsert(value, index, head);
    }

    public Node recInsert(int value,int index,Node node){
        if (index == 0) {
            Node node1 = new Node(value,node);
            size++;
            return node1;
        }

        node.next = recInsert(value, index - 1, node.next);

        return node;
    }

    public void insert(int value,int index){
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node node = head;

        for(int i = 1; i < index; i++){
            node = node.next;
        }

        Node temp = new Node(value, node.next);
        node.next = temp;
        
        size++;
    }

    public void display(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }


    // questions

    public Node removeDuplicates(Node head){
        Node node = head;
        Node dummyHead = node;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size++;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;

        return dummyHead;
    }
}
