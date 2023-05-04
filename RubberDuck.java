public class RubberDuck extends Duck{

    RubberDuck(){
        flybehavior=new FlyNoWay();
        quackbehaviour=new Squeak();
        swimbehaviour=new Float();
    }
    @Override
    void display() {
        System.out.println("I am Rubber Duck...");

    }
}
