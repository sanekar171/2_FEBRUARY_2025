public class AtLeast1Greater {
    public static void main(String[] args) {
        System.out.println(bruteForce(new int[]{2,5,1,4,8,0,8,1,3,8}));//O(N^2)TC
        System.out.println(twoLoops(new int[]{2,5,1,4,8,0,8,1,3,8}));//O(N) 2 loops
        System.out.println(threeLoops(new int[]{2,5,1,4,8,0,8,1,3,8}));//O(N) 3 loops
    }

    static int bruteForce(final int[]A)
    {
        int count=0;
        int N=A.length;
        Boolean isLGreat=null;
        Boolean isRGreat=null;
        //outer loop=loop of indices
        L1:for(int i=0;i<=N-1;i++)
        {
            isLGreat=isRGreat=Boolean.FALSE;
            //search left
            L2:for(int j=0;j<=i-1;j++)
            {
                if(A[j]>A[i])
                {
                    isLGreat=Boolean.TRUE;
                    break L2;
                }
            }
            //search right
            L3:for(int j=i+1;j<=N-1;j++)
            {
                if(A[j]>A[i])
                {
                    isRGreat=Boolean.TRUE;
                    break L3;
                }
            }
            if(isLGreat==Boolean.TRUE || isRGreat==Boolean.TRUE)
            {
                count++;
            }
        }
        return count;
    }//method

    static int twoLoops(final int[]A)
    {
        int N=A.length;
        int max1=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }

        for(int i=0;i<=N-1;i++)
        {
            if(A[i]!=max1)
            {
                count++;
            }
        }
        return count;
    }//method

    static int threeLoops(final int[]A)
    {
        int N=A.length;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }

        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max2 && A[i]<max1)
            {
                max2=A[i];
            }
        }

        for(int i=0;i<=N-1;i++)
        {
            if(A[i]<=max2)
            {
                count++;
            }
        }
        return count;
    }//method
}
