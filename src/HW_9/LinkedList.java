package HW_9;

public class LinkedList implements Linked
{
    Element first = null;
    Element last = null;
     static int count = 0;

    public boolean add(String string)//метод добавления элемента в конец списка
    {
        boolean flag = false;
       Element newElement = new Element(string);
       if (first == null)
       {
           first = newElement;
           count++;
           flag = true;
       }
       else
       {
           last.next = newElement;
           newElement.previous = last;
           count++;
          newElement.setIndex(count-1);;
          flag = true;
       }
       last = newElement;
       return flag;
    }

    public void printList()//метод печати списка
    {
        Element current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            System.out.println(current.string + "  " + current.getIndex());
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public boolean contains(String str)//метод проверки наличия элемента
    {
        Element current = first;
        while(current.string != str)
        {
            current = current.next;
            if(current == null)
                return false;
        }
        return true;
    }

    public String get(int index)//метод получения элемента по индексу
    {
        Element current = first;
        while(current.getIndex() != index)
        {
            current = current.next;
            if(current == null)
                return null;
        }
        return current.string;
    }

    public boolean delete (String str)//метод удаления элемента
    {
        Element current = first;
        while(current.string != str)//перебор идет пока элемент не будет найден
        {
            current = current.next;
            if(current == null) return false;//если элемент не найден в списке
        }

        if(current==first)
            first = current.next;//удаление элемента в случае если он перввый
        else current.previous.next = current.next;//удаление элемента из середины списка

        if(current==last) //удаление элемента в случае если он последний
            last = current.previous;
        else current.next.previous = current.previous;//удаление элемента из середины списка

        return true;
    }

    public int getSize()//метод получения размера списка
    {
       return count;
    }




}
