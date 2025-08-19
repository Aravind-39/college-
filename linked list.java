import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Linked List: " + list);

        
        list.add(2, "Orange");
        System.out.println("After adding Orange: " + list);

        
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
    }
}
