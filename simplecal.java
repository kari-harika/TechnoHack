import java.util.*;
class Main
{
public static void main(String[] args) {
double res=0;
Scanner sc=new Scanner(System.in);
System.out.println(x:"enter the first input number: ");
double in1=sc.nextDouble();
System.out.println(x:"enter the second input number: ");
double in2=sc.nextDouble();
System.out.println("2 intput numbers are: "+in1+"and "+in2);
System.out.println(x:"\n1.addtion\n2.subtraction\n3.multiplaction\n4.division\n5.modular division");
System.out.println(x:"enter the input choice");
int choice=sc.nextInt();
switch (choice) {
    case 1:
        res=in1+in2;
        break;
    case 2:
        res=ini-in2;
        break;
    case 3:
        res-in1in2;
        break;
    case 4:
        res-in1/in2;
        break;
    case 5:
        res-in1%in2;
        break;
    default:
        System.err.println(x:"enter the proper choice");
        res-0;
        break;
}
System.err.println("the result is"+res);