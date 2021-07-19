package lamda.interface_a;

@FunctionalInterface
public interface Foo {
    void someThing();

    default void print(){
        System.out.println("1");
    }
}
