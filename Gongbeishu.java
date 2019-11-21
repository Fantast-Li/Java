public class Gongbeishu
{
    public static void main(String[]args)
    {
        int num1=46;
        int num2=23;
        int min=Math.min(num1,num2);
        for(int i=min;i>=1;i--){
            if(num2%i==0&&num1%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}