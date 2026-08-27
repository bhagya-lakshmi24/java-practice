import java.lang.*;
 class Computer
{
    public void playMusic()
    {
        System.out.println("music playing");
    }
    public String getMeAPen(int cost)
    {
        return "pen";
    }
}

 public class Demo
{
    public static void main(String a[])
    {
       Computer obj=new Computer();
       obj.playMusic();      
       String str=obj.getMeAPen(10);
       System.out.println(str); 
    }
}