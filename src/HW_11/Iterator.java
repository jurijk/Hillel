package HW_11;

//Класс итератора для массива

public class Iterator
{

    Massive mas1;

    public Iterator(Massive mass) {//создается объект типа Iterator инициализируемый ссылкой на объект типа Massive
        mas1 = mass;
    }

    boolean hasNext()
    {
        boolean flag = false;

       if (this.mas1.isElement() != null)
       {
           flag = true;
           this.mas1.setCount(this.mas1.getCount()+1);
       }
       else
            {
                flag = false;
                this.mas1.setCount(0);
            }
       return flag;
    }

    String next()
    {
           return this.mas1.isElement();
    }

    void remuve()
    {
        while (this.hasNext())
        {
            this.mas1.setElement();
        }
    }





}
