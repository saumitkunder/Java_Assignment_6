public class MallardDuck extends Duck{

    MallardDuck(){
        flybehavior=new FlyWithWings();
        quackbehaviour=new Quack();
        swimbehaviour=new Swim();
    }
    @Override
    void display() {
        System.out.println("I am Mallard Duck...");
    }
}
