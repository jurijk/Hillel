import java.util.Arrays;

public class Collection {

    static int size = 5;//размер массива
    static int counter = 0;//количество элементов в массиве (коллекции)
    static String [] collect = new String[size];


    void add (String string)   //метод добавляющий элемент
    {
        for (int i=0; i < collect.length; i++)
        {
            if (collect[i] == null)
            {
                collect[i] = string;
                counter++;
                break;
            }
        }
        if (counter == collect.length - 1){ //увеличение размера массива
        size = size + 5;
            String [] collectemp = Arrays.copyOf(collect, size);
            collect = collectemp;
        }
    }


    String get (int index){//метод получения элемента по индексу
        if (collect[index] != null){
            return collect[index];
            }
        else return null;
    }


    void delete (int index){//метод удаления элемента по индексу
        if (collect[index] != null){
            for (int i=index; i < collect.length-1; i++){
                collect[i] = collect[i+1];
                }
            counter--;
        }
        else collect[index] = null;
    }


    int getSize(){//метод получения размера массива
        return counter;
    }


    boolean contains(int index){//метод проверки наличия элемента
        if (collect[index] == null)
            return false;
        else
            return true;
    }


    void clear(){  //метод очистки массива
        for (int i=0; i < collect.length; i++){
            collect[i] = null;
            counter = 0;
        }
    }

     boolean equals(int index1, int index2){  //метод проверки двух элементов массива на эквивалентность
        if (collect[index1] == collect[index2]){
            return true;
        }
        else return false;
     }

    int indexOf(String string) //метод получения индекса элемента
    {
        int index = 0;
        for (int i=0; i < collect.length; i++)
        {
            if (collect[i] == string)
            {
                index = i;
                break;
            }
            else index = -1;
        }
        return index;
    }


    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        System.out.println(collect.length);
        collection.add("four");
        System.out.println(collect.length);
        collection.add("five");
        collection.add("six");

        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println(collection.get(3));
        System.out.println(collection.get(4));
        System.out.println(collection.get(5));

        System.out.println(collection.getSize());

    }

}
