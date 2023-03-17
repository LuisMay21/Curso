import java.util.Scanner;

public class FirstAdd 
{

public static void main(String[] x)
{

int a,total=0,num=1;

Scanner reader = new Scanner(System.in);

a=reader.nextInt();


for(int i=0;i<a;i++)
{
   

   total+=num;
   num++;

}
 
System.out.println("total de "+a+" es "+total);
}
    
}
