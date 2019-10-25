import java.util.Arrays;

public class Collection {

    static int size = 5; //размер массива
    static int counter = 0; //количество элементов в массиве (коллекции)
    static String [] collect = new String[size];


    boolean add (String string)   //метод добавляющий элемент
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

        if (counter == collect.length - 1) //увеличение размера массива
        {
        size = size + 5;
            String [] collectemp = Arrays.copyOf(collect, size);
            collect = collectemp;
        }
        return true;
    }


    String get (int index){ //метод получения элемента по индексу
        if (index < counter)
        {
        if (collect[index] != null)
            {
            return collect[index];
            }
        else return null;
        }
        return null;
    }


    boolean delete (int index){ //метод удаления элемента по индексу
        if (index < counter)
        {
            if (collect[index] != null)
            {
                for (int i = index; i < collect.length - 1; i++)
                {
                collect[i] = collect[i + 1];
                }
                counter--;
                return true;
            } else return false;
        }
        return false;
    }


    int getSize(){ //метод получения размера массива
        return counter;
    }


    boolean contains(int index) //метод проверки наличия элемента
    {
        if (index < counter)
        {
            if (collect[index] == null)
                return false;

            else
                return true;
        }
        return false;
    }


    void clear(){  //метод очистки массива
        for (int i=0; i < collect.length; i++){
            collect[i] = null;
            counter = 0;
        }
    }

     boolean equals(Collection collection)//метод проверки двух элементов массива на эквивалентность
     {
         int count1=0;
         if (counter != collection.getSize())
         {
             for (int i = 0; i < counter; i++)
             {
                 if (collect[i] == collection.get(i))
                 {
                     count1++;
                 }
             }
             if (counter == count1)
             {
                 return true;
             }
             else return false;
         }
         return false;
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


    Collection trim( Collection collection){ //метод обрезки массива под размер коллекции
        if (collection.getSize() == collect.length) return collection;
        else
            {
                String [] collectemp = Arrays.copyOf(collect, collection.getSize());
                collect = collectemp;
            }
        return collection;
    }

    public static void main(String[] args)
    {
        Collection collection = new Collection();
        System.out.println(collection.add("one"));
        collection.add("two");
        collection.add("three");
        collection.add("four");
        collection.add("five");
        collection.add("six");

        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println(collection.get(3));
        //System.out.println(collection.delete(5));
        System.out.println(collection.get(4));

        System.out.println(collection.getSize());


    }

}






