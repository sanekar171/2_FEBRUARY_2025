import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotationGame {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split("\\s");
        int N = Integer.parseInt(values[0]);
        int[] A = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            A[i] = Integer.parseInt(values[i + 1]);
        }
        int B = Integer.parseInt(br.readLine());

        B = B % N;//extremely vital else AIOBE
        int t;

        //[0,N-B-1]
        for (int i = 0, j = N - B - 1; i < j; i++, j--) {
            t = A[i];
            A[i] = A[j];
            A[j] = t;
        }

        //[N-B,N-1]
        for (int i = N - B, j = N - 1; i < j; i++, j--) {
            t = A[i];
            A[i] = A[j];
            A[j] = t;
        }

        //[0,N-1]
        for (int i = 0, j = N - 1; i < j; i++, j--) {
            t = A[i];
            A[i] = A[j];
            A[j] = t;
        }

        for (int i = 0; i <= N - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

}
