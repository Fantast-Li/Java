package Study11_5;

public class Test {
public static void main(String[]args){
    MyArray myArray = new MyArray(3);
    //{1,2,3,4}->{1,2,10,3,4}
    myArray.add(1);
    myArray.add(2);
    myArray.add(3);
    myArray.add(4);
    myArray.add(4);
    myArray.add(4,10);
    myArray.find(4);
    myArray.contains(10);
    myArray.size();
    myArray.set(2,15);
    myArray.remove(4);
    myArray.print();

}
}
