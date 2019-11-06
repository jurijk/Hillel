package HW_11;

// Класс с массивом возвращающий итератор

public class Massive { //создаем массив заданного размера
    String[] mas;
    private int count = 0;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Massive(int size) {
        this.mas = new String [size];

        mas[0] = "00";
        mas[1] = "11";
        mas[2] = "22";
        mas[3] = "33";
        mas[4] = null;

    }

    public Iterator getIterator() {
        return new Iterator(this);
    }

    public String isElement()
    {
        return mas[count];
    }

    void setElement()
    {
        mas[count-1]=mas[count];
    }



}
