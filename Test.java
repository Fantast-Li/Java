
class Per {
    public int age = 19 ;
    public String name ="西西";
    public void show(){
        System.out.println("我对象叫"+name+",今年芳龄"+age);
    }

}
public class Test {
    public static void main(String []args){
        Per person = new Per();
        person.show();
        Per person1 =new Per();
        person1.age=18;
        person1.name="二狗子";
        person1.show();
    }
}

