public abstract class Duck {
    Flybehavior flybehavior;
    Quackbehaviour quackbehaviour;

    Swimbehaviour swimbehaviour;

    abstract void display();

    public void setFlybehavior(Flybehavior fb){
        flybehavior=fb;
    }
    public void setQuackbehaviour(Quackbehaviour qb){
        quackbehaviour=qb;
    }
    public void setSwimbehaviour(Swimbehaviour sb){
        swimbehaviour=sb;
    }

    public void performQuack() {
        quackbehaviour.Quack();
    }
    public void performFly(){
        flybehavior.fly();
    }
    public void performSwim(){
        swimbehaviour.swim();
    }


}
