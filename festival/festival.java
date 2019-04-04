import java.util.*;
import java.io.*;

public class festival {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] day = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] shows = new int[n][2];
        for (int i = 0; i < n; i++) {
            shows[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(shows, (a, b)->Integer.compare(a[1], b[1]));


        int[][] sol = new int[n][2];
        sol[0][0] = shows[0][1];
        sol[0][1] = shows[0][1] - shows[0][0] + 1;

        int j = 0;
        for (int i = 1; i < n; i++) {
            int clen = shows[i][1] - shows[i][0] + 1;


            int p = i-1;
            while(p >= 0 && sol[p][0] >= shows[i][0]) p--;

            if (p >= 0) clen += sol[p][1];
            if(sol[i-1][1] < clen) {
                sol[i][0] = shows[i][1];
                sol[i][1] = clen;
            } else sol[i] = sol[i-1];


        }

        int k = day[1] - day[0] - sol[n-1][1] + 1;
        System.out.println(k);
    }
}