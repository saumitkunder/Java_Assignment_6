public class RedHeadDuck extends Duck{

    RedHeadDuck(){
        flybehavior=new FlyWithWings();
        quackbehaviour=new Quack();
        swimbehaviour=new Swim();
    }
    @Override
    void display() {
        System.out.println("I am Red Head Duck...");

    }
}
