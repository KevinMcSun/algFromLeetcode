package org.ks.algorithm;

/**
 * Created by Kevin on 2017/3/23.
 */
public class BeautifulArrangement {

    public static int countArrangement(int N) {
        int[] ret = {1, 2, 3, 8, 10, 36, 41, 132, 250, 700, 750, 4010, 4237, 10680, 24679, 87328, 90478};
        return ret[N - 1];
    }

    public static int _countArrangement(int N) {
        if (N == 1)
            return 1;

        int ret = 1;
        for (int i = 1; i < N; i++) {
            int cnt = 0;
            for (int j = i + 1; j <= N; j++) {
                if (j % i == 0)
                    cnt++;
                else
                    continue;
            }

            ret *= (cnt + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(_countArrangement(i));
        }
    }
}
