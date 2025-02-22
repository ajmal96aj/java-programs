import java.util.*;
import java.util.Scanner;
class forloop2
//the program prints the sum of x ranging from 1 to 20
{
    public static void main(String[]args)
    {
        int sum=0,i;
        for(i=1;i<=20;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum:"+sum);
    }
}