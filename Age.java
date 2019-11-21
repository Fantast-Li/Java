import java.util.Scanner;
public class Age

{
   
    public static void main(String[]args)
    {
       
       System.out.println("请输入你的年龄：");
       Scanner sc=new Scanner(System.in);
       int age =sc.nextInt();
       if(age<=120)
       {
      if(age>0&&age<=18){
            System.out.println("少年");
        }
         if(age>18&&age<=28){
       System.out.println("青年");
       }
       if(age>18&&age<=55){
        System.out.println("中年");
      }
      else if(age>=56) {
          System.out.println("老年");
        }
        }
else{
  System.out.println("请重新输入年龄");
}
      System.out.println(age);
    }
}