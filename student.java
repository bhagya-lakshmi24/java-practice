class Demo{
    String name;
    int price;
    String brand;
    void show(){
        System.out.println(name +" "+ price +" " +brand);
        
    }

}
public class student{
    public static void main(String a[]){
        Demo obj=new Demo();
        obj.name="vivo";
        obj.price=20000;
        obj.brand="vivo";
        obj.show();
        System.out.println("***************");
        Demo obj2=new Demo();
        obj2.name="vivo";
        obj2.price=40000;
        obj2.brand="vivo";
        obj2.show();
    }
}