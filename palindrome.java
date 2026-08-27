class palindrome{
    public static void main(String a[]){
        int num=129,rev=0,dig=0;
        int real=num;
        while(num>0)
        {
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        if(real==rev)
           System.out.println("num is palindrome");
        else
           System.out.println("num is not palindrome");
    }
}