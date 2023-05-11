import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
//        list = insert(list, 5);
//        list = insert(list, 6);
//        list = insert(list, 7);
//        list = insert(list, 8);)
        System.out.println(list);

    }
}