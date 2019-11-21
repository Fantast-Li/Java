public class Leapyear
{
    public static void main(String[]args)
    {
        for(int i=1000;i<=2000;i++){
            if(i%100==0){         //判断世纪闰年
                if(i%400==0){      
                    System.out.print(i+" ");
                }
            }
            else{
                if(i%4==0){      //判断普通闰年
                    System.out.print (i+" ");
                }
            }
        }   
        
    }
}