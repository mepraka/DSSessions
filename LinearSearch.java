package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public int linearSearch(int[]arr,int element){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        LinearSearch obj=new LinearSearch();
        int element=sc.nextInt();
        System.out.println("Element found at Position "+(obj.linearSearch(arr,element)+1));
    }
}
