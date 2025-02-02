import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMax {
    /**
     * ake input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.
     *
     * Problem constraints
     *
     * 1 <= N <= 1000
     *
     * 1 <= A <= 1000
     *
     *
     * Input Format
     *
     * The first line contains a single integer N representing the length of the array A followed by N elements of the array A.
     *
     *
     * Output Format
     *
     * A single line output containing two space-separated integers.
     * The first integer is the maximum value of the array.
     * The second integer is the minimum value of the array.
     *
     * There is **no space** after the minimum value in the output format.
     * There is only a **single space** between the maximum and minimum value.
     *
     *
     * Example Input
     *
     * Input 1:
     * 5 1 2 3 4 5
     * Input 2:
     * 4 10 50 40 80
     *
     * Example Output
     *
     * Output 1:
     * 5 1
     * Output 2:
     * 80 10
     * Note: There is no space after the minimum value in the output format.
     * There is only a single space between the maximum and minimum value.
     */
    public static void main(String ARGUMENT_VALUES[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[]values=br.readLine().split("\\s");

        int N=Integer.parseInt(values[0]);
        int[]A=new int[N];

        for(int i=0;i<=N-1;i++)
        {
            A[i]=Integer.parseInt(values[i+1]);
        }

        //System.out.println(Arrays.toString(A));
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        System.out.println(max+" "+min);
    }//method
}
