import java.util.Scanner;
public class guessinggame {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=5;
        int number= 1+(int)+(100*Math.random());
            System.out.println("You hav number of chances"+ k +"times to guess the number");
        System.out.println("you have to select the numbers between 1 to 100:");
        for(int i=1;i<k;i++){
        System.out.println("enter your guess:");
        int guess=sc.nextInt();
        if(guess==number){
            System.out.println("Congratulations! you have sekected the right number ");
        }
        else if(guess<number){
            System.out.println("the  number is greater than "+guess);
        }
        else if(guess > number)
        {
            System.out.println("the number is smaller than "+guess);
        }
            System.out.println("the number of times is completed try again later");
    }
    sc.close();
}
}