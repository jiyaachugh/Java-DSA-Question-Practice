import java.util.*;
public class RemoveElements {


        public static void main(String args[])
        {
            LinkedList<String> ll = new LinkedList<>();

            ll.add("Name");
            ll.add("Jiya");
            ll.add(1, "is");

            System.out.println("Initial LinkedList " + ll);

            ll.remove(1);

            System.out.println("After the Index Removal " + ll);

            ll.remove("Name");

            System.out.println("After the Object Removal "
                    + ll);

    }
}
