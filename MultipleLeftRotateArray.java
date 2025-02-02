import java.util.Arrays;

public class MultipleLeftRotateArray {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        int[]B={2,3};
        System.out.println(Arrays.deepToString(new MultipleLeftRotateArray().solve(A,B)));
    }

    public int[][] solve(int[]A,int[]B)
    {
        int[][]O=new int[B.length][];
        int N=A.length;
        int t;
        //outer loop=loop for number of rotations
        //copy the array freshly for each rotation
        int[]T;
        /**
         * T=new int[N];
         * This line here causes incorrect output
         */
        for(int i=0;i<=B.length-1;i++)
        {
            //K=K%N
            B[i]=B[i]%N;
            T=new int[N];
            //copy array fresh
            for(int j=0;j<=N-1;j++)
            {
                T[j]=A[j];
            }
            for(int m=0,n=B[i]-1; m<n ; m++,n--)
            {
              t=T[m];
              T[m]=T[n];
              T[n]=t;
            }

            for(int m=B[i],n=N-1; m<n ; m++,n--)
            {
                t=T[m];
                T[m]=T[n];
                T[n]=t;
            }

            for(int m=0,n=N-1; m<n ;m++,n--)
            {
                t=T[m];
                T[m]=T[n];
                T[n]=t;
            }
            O[i]=T;//**
        }
        return O;
    }//method
}
