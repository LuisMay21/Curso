import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] s)
    {
        int a=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa Numero");
        a=scan.nextInt();

        if(a % 2 == 0)
        {
          System.out.println("Es Par");  
        }
        else
        {
            System.out.println("Es Impar");
        }


        

    }
    
}
