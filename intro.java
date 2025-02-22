import java.util.*;
import java.util.Scanner;
class intro
{
    public static void main(String[]args)
    {
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the symbol for addition");
        ch=obj.next().charAt(0);
        System.out.println(ch+"is used for addition");
    }
}