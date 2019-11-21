import java.util.Scanner;
public class Factor
{
    public static void main(String[]args)
    {
     System.out.println("please leap a num:");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int ret=factor(num);
     System.out.println(ret);
      
    }
      public static int factor(int num)
        {
         if(num==1){
             return 1;
         }
         else{
          int ret=num*factor(num-1);
          return ret ;
         }
        }
}