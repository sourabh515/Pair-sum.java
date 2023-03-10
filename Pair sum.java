import java.util.*;
public class Pair_Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length-1;i++){
            int temp=a[i];
            for(int j=i+1;j<a.length-1;j++){
                int arr=(int) (temp+a[j]);
                if(arr==6){
                    System.out.println(temp +","+ a[j]);
                }
            }
        }
    }
    
}