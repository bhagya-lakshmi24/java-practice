//inner class
class first{
    int age;
    public void show(){
        System.out.println("in show method");
    }
    class second{
        static void display(){
            System.out.println("in display method");
        }
    }
}
public class innerclass{
    public static void main(String a[]){
        first obj=new first();
        obj.show();
        first.second.display();
    }
}