package HW_9;

public class LinkTest {

    public static void main(String[] args) {
        LinkedList test = new LinkedList();

        test.add("11");
        test.add("22");
        test.add("33");
        test.add("44");
        test.add("55");

        test.printList();

        System.out.println(test.getSize());
        System.out.println("");

        System.out.println(test.contains("33"));
        System.out.println("");
        System.out.println(test.contains("66"));
        System.out.println("");
        System.out.println(test.get(2));
        System.out.println("");
        System.out.println(test.get(5));

        System.out.println(test.delete("33"));
        System.out.println(test.delete("11"));
        System.out.println(test.delete("55"));
        System.out.println(test.delete("66"));
        System.out.println("");
        test.printList();
    }
}
