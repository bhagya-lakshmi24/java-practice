//method overloading : same method name but with diff parameters and data types
/*ex: method name in this program is "add", here we can use this method multiple time but getting no error beacause
we use diff parameters.*/

public class DEMO1{
     public static void main(String a[]){
        calc obj=new calc();
        int r1=obj.add(8,4);
        System.out.println("resutl="+r1);
    }
}    
class calc{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }
}
