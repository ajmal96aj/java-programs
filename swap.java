import java.util.Scanner;
public class swap{
    /**
     * @param args
     */
    public static void main(String[]args){
        int a=100,b=200;
        System.out.println("before swapping");
        System.out.println("enter the value of a = "+a);
        System.out.println("enter the value of b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("the value of a = "+a);
        System.out.println("the value of b = "+b);
        
    }
}