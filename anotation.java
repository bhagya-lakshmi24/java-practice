@Deprecated
class A{
    public void displays(){
        System.out.println("Hello");
    }
}
class B extends A{
    @Override
    public void displays(){
        System.out.println(" World");
    }
}
public class anotation {
    public static void main(String[] args) {
        A obj = new A();
        obj.displays();
    }
} 
