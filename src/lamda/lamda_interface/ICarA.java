package lamda.lamda_interface;

public interface ICarA {
    default void print(){
        System.out.println("BMW");
    }

    static void blow(){
        System.out.println("Blow");
    }
}
