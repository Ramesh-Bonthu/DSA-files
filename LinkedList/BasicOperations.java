package LinkedList;

import java.util.LinkedList;

public class BasicOperations {
    public static void main(String[] args) {
        LL list = new LL();   
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.insertLast(6);
        list.display();
        list.insertRec(100, 3);
        list.display();

        list.insertRec(200, 3);
        list.display();

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        System.out.println(list1);

        //System.out.println(list.deleteFirst());
        //list.display();

        //System.out.println(list.deleteLast());
        //list.display();

        //System.out.println(list.delete(3));
        //list.display();
        
    }
}
