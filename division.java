import java.util.Scanner;
public class division{
    public static void main(String[]args){
        int num1,num2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the num1");
        num1=input.nextInt();
        System.out.println("enter the num2");
        num2=input.nextInt();
        result=num1/num2;
        System.out.printf("%d/%d=%d",num1,num2,result);
    }
}