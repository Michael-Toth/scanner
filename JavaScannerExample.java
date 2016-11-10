import java.util.Scanner;

/**
 */
public class JavaScannerExample
{

  public static void main (String[] args)
  {
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);

    //  prompt for the user's name
    System.out.print("Enter your Number: ");


    // get the age as an int
    int number = scanner.nextInt();
   
    boolean isDivisibleBy15 = number % 15 == 0;
    boolean isDivisibleBy5 = number % 5 == 0;
    boolean isDivisibleBy3 = number % 3 == 0;
    if(isDivisibleBy3){    System.out.println(String.format("%s, word",  number));
}
    else if(isDivisibleBy5){    System.out.println(String.format("%s, smith",  number));
}
    else if(isDivisibleBy15){    System.out.println(String.format("%s, wordsmith",  number));
}
    else if(!isDivisibleBy15&&!isDivisibleBy3 &&!isDivisibleBy5){    System.out.println(String.format("%s, number u entered was",  number));
}


  }

}
