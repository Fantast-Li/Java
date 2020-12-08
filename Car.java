package homeWork;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("我是Car类重新接口Vehicle的start 的方法");
    }

    @Override
    public void stop() {
        System.out.println("我是Car类重新接口Vehicle的stop 的方法"    );

    }

}
