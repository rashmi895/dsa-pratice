import java.util.*;
public class MaxminFinder{
    public static int max(int arr[],int n){
int maxi=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    if(arr[i]>maxi){
 maxi=arr[i];
    }
}

return maxi;
    }
    public static int min(int arr[],int n){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<mini){
                 mini=arr[i];
            }
        }
        return mini;
    }
    public static void main (String []args){
int[] A ={3,4,7,9,2};
int n=A.length;
System.out.println("maximum element is "+max( A,n));
System.out.println("minimum element is "+min(A,n));
    }
}
