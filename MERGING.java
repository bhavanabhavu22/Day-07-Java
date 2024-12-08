import java.util.*;
public class MERGING {
    public static void main(String args[])
    {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int k=0;
        int temp[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            temp[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            temp[k]=arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
}