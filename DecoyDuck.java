public class DecoyDuck extends Duck{

    DecoyDuck(){
        flybehavior=new FlyNoWay();
        quackbehaviour=new MuteQuack();
        swimbehaviour=new Sink();
    }
    @Override
    void display() {
        System.out.println("I am Decoy Duck.....");
    }
}
