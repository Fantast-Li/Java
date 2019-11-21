public class Add
{

    public static void main(String[]args)
    {
      int num=10;
      int ret=add(num);
      System.out.println(ret);

    }
    public static int add(int num)
    {
        if(num==1){
            return 1;
        }
        return num+add(num-1);
        
    }
}