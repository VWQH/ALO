package Lamda.LamdaInterface;

public class Car implements ICarA, ICarB{
    @Override
    public void print() {
        ICarA.super.print();
        ICarB.super.print();
        System.out.println("Car");
        ICarA.blow();
    }
}
