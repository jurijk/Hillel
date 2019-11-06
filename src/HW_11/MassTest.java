package HW_11;

//Тестирование итератора

public class MassTest {
    public static void main(String[] args) {


        Massive massive = new Massive(5);
        Iterator iterator1 = massive.getIterator();

        System.out.println(iterator1.mas1.getCount());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.mas1.getCount());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.mas1.getCount());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        iterator1.remuve();
        System.out.println(iterator1.mas1.getCount());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.mas1.getCount());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());




    }
}
