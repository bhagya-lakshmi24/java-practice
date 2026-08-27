class largest{
    public static void main(String args[]){
        int arr[]={3,7,5,6,9};
        int largest=arr[0];
        for(int i=0;i<=4;i++){
            if(arr[i]>largest)    
             largest=arr[i];
        }
        System.out.println(largest);
    }
}