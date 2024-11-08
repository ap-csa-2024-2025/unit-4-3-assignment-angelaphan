import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    problem3();
  }
  public static void problem1()
  {
    int num =1;
    while (num<=25)
    {
      if (num%2==1)
      {
        System.out.println(num);
      }
      num++;
    }
  }
  public static void problem2()
  {
    int num =17;
    int counter=0;
    while (num<=73)
    {
      System.out.print(num);
      num++;
      counter++;
      if (counter%10==0)
      {
        System.out.print("\n");
      }
      else
      {
        System.out.print(" ");
      }
      
    }
  }
  public static void problem3()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an int from 0 to 50");
    int num = scan.nextInt();
    if (num<=0 || num>=50)
    {
      System.out.println("error");
    }
    else
    {
      int counter=0;
      while (num<=50)
      {
        System.out.print(num);
        num++;
        counter++;
        if (counter%5==0)
        {
          System.out.print("\n");
        }
        else
        {
          System.out.print(" ");
        }
      }
  }
}
public static void problem4();
{
  
}
}
