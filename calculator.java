import java.util.Scanner;
public class calculator{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    char operator;
    double num1,num2,result;
    System.out.print("enter the first number:");
    num1=sc.nextDouble();
    System.out.print("enter the second number:");
    num2=sc.nextDouble();
    System.out.print("enter the operator:");
    operator=sc.next().charAt(0);
    switch(operator){
        case '+':
            result=num1+num2;
            System.out.print("the operation performed is addition"+result);
            break;
        case '-':
            result=num1-num2;
            System.out.print("the operation performed is subtraction"+result);
            break;
        case '*':
            result=num1*num2;
            System.out.print("the operation performed is multiplication"+result);
            break;
    } 
}
}
