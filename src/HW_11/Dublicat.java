package HW_11;

import java.util.ArrayList;
import java.util.Arrays;

//метод удаляющий дубликаты в коллекции

public class Dublicat {

   ArrayList<String> al = new ArrayList<>();
   String[] str = new String[al.size()];


    public ArrayList noDublicat(ArrayList list)
   {
       str = al.toArray(str);
       for (int i = 0; i < str.length; i++)
       {
           for (int j = 1; j < str.length; j++)
           {
               if (str[i] == str[j])
               {
                   str[j] = null;
                   for (int k = j; k < str.length-1; k++)
                       str[k] = str[k+1];
               }
           }
       }
       return (ArrayList) Arrays.asList(str);
   }
}
