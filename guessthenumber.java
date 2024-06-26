import java.util.*;
class GuessNumber
{
    public void guessnum()
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("you have 5 chances to guess the number");
        int k=5;
        int num=1+(int) (100 * Math.random());
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("enter the guessing number");
            int guess=sc.nextInt();
            if(num==guess)
            {
                System.out.println("you are sucessfully guessed the number");
               
                break;
            }
            else if(num>guess && k-1!=i)
            {
                System.out.println("the number is greater than guessing number");
               
            }
            else if (num<guess && k-1!=i)
            {
                System.out.println("the number is less than the guessing number");
               
            }
           
        }
        if(k == i)
        {
            System.out.println("your chance have been completed succesfully ");
            System.out.println("the number you need to guess is:"+num);
               
        }
    }
}
class Main
{
    public static void main(String[] args) {
        GuessNumber g=new GuessNumber();
        g.guessnum();
    }
}
