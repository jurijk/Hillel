package HW_9;

public class Element
{

    public String string;
    public Element next;
    public Element previous;
    private int index = 0;

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public Element (String str)
    {
        string = str;
    }

}
