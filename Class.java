//public class Class {
//    public static void main (String[]args){
//        Person person =new Person();
//        person.eat();
//        person.sleep();
//        Person person1=new Person();
//        Person person2=new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//        System.out.println(person2.set);
//    }
//}
//
//
// class Person {
//    public int age=18;
//    public String name="张三";
//    public String set="男";
//
//    public void eat() {
//        System.out.println("恰饭！！！");
//
//    }
//
//    public void sleep() {
//        System.out.println("睡觉舒服！！！！");
//    }
//}



//
//class Person {
//
//    public int age;
//    public String name;
//    public String sex;
//    public static int count;
//    public final int SIZE = 10;
//    public static final int COUNT = 99;
//
//    public void eat() {
//        int a = 10;
//        System.out.println("eat()!");
//    }
//
//    public void sleep() {
//        System.out.println("sleep()!");
//    }
//
//    public static void staticTest() {
////             set="man";
//        System.out.println("staticTest()!");
//    }
//
//}
//public class Class {
//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//        person.sleep();
//        person.eat();
//        System.out.println(Person.count);
//        System.out.println(Person.COUNT);
//        Person.staticTest();
//    }
//}

class Person{
    private int age ;
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }


    public void show (){
        System.out.println("name"+name+"age"+age);
    }

}
public class Class {

   public static void main(String[] args){
        Person person=new Person();
        person.setName("xixi");
        String name = person.getName();
        System.out.println(name);
        person.show();
   }

}








