import java.util.*;
class rev{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int rev=0,dig;
        while(num>0){
           dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        System.out.println(rev);
    }
}