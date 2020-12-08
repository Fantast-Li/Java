package homeWork;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("我是Bike类重新接口Vehicle的start 的方法");
    }

    @Override
    public void stop() {
        System.out.println("我是Bike类重新接口Vehicle的stop的方法");
    }
}
