import java.util.Arrays;

public class RotateRight {

    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        System.out.println(Arrays.toString(rotateLeftOneBitAtTime(A,22)));
        System.out.println(Arrays.toString(rotateLeftTempArray(A,2)));
        System.out.println(Arrays.toString(rotateReversal(A,2)));
    }

    static int[] rotateLeftOneBitAtTime(final int[]A,int K)
    {
        int N=A.length,first;;
        K=K%N;
        for (int j = 1; j <= K; j++) {
            first = A[0];
            for (int i = 0; i <= N - 2; i++) {
                A[i] = A[i + 1];
            }
            A[N - 1] = first;
        }
        return A;
    }//method

    static int[] rotateLeftTempArray(final int[]A,int K)
    {
        int N=A.length;
        K=K%N;
        int []T=new int[N];

        for(int i=0;i<=K;i++)
        {
            T[i]=A[i+K];
        }
        for(int i=K+1;i<=N-1;i++)
        {
            T[i]=A[i-K-1];
        }
        return A;
    }//method

    static int[] rotateReversal(final int[]A,int K)
    {
        int N=A.length;
        K=K%N;
        int t;

        for(int i=0,j=K-1; i<j ;i++,j--)
        {
         t=A[i];
         A[i]=A[j];
         A[j]=t;
        }

        for(int i=K,j=N-1; i<j ;i++,j--)
        {
            t=A[i];
            A[i]=A[j];
            A[j]=t;
        }

        for(int i=0,j=N-1; i<j ; i++,j--)
        {
            t=A[i];
            A[i]=A[j];
            A[j]=t;
        }

        return A;
    }//method

}