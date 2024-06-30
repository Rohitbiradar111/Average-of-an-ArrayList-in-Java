//This program calculates the Average of an ArrayList in Java

import java.util.ArrayList;
public class AverageofanArrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(-12);
        al.add(8);
        al.add(-7);
        al.add(6);
        al.add(12);
        al.add(-9);
        al.add(14);
        System.out.println(al);

        double sum = 0;
        double count = 0;
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i)>=0)
            {
                sum = sum + al.get(i);
                count++;
            }
        }
        System.out.println("Average = "+(sum/count));
    }
}