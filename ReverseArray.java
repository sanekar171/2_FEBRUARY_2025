import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(temporarayArray(A)));
        //System.out.println(Arrays.toString(swappingTwoPointers(A)));
        //if this uncommented third sop prints wrongly
        //System.out.println(Arrays.toString(swappingOneIndex(A)));
        ArrayList<Integer>l1=new ArrayList<>();
        for(int temp:A)
        {
            l1.add(temp);
        }
        System.out.println(reverse(l1));
    }

    static int[] temporarayArray(final int[]A)
    {
        //i,N-1-i
        int N=A.length;
        int[]T=new int[N];

        for(int i=0;i<=N-1;i++)
        {
            T[i]=A[N-1-i];
        }
        return T;
    }//method

    static int[] swappingTwoPointers(final int[]A)
    {
        int N=A.length;
        int t;

        for(int left=0,right=N-1; left<right ; left++,right--)
        {
            t=A[left];
            A[left]=A[right];
            A[right]=t;
        }
        return A;
    }//method

    static int[] swappingOneIndex(int []A)
    {
        int N=A.length,t;
        for(int i=0;i<=N/2;i++)
        {
            t=A[i];
            A[i]=A[N-1-i];
            A[N-1-i]=t;
        }
        return A;
    }//method

    static ArrayList<Integer> reverse(final ArrayList<Integer> A)
    {
        Collections.reverse(A);
        return A;
    }//method

}
