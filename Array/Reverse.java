public class Reverse {
  
    public static void fun1(int arr[]){

        for(int i=0;i<arr.length/2;i++){
         // int n;
          int temp=  arr[i];
         
          arr[i]=arr[arr.length-i-1];
          arr[arr.length-i-1]=temp;
          
        }
      }
        public static void main (String[]args){
int arr[]={3,5,9,6,1,7};
fun1(arr);
for (int i=0;i<arr.length;i++){
  System.out.println(arr[i]);
}
    }
}
