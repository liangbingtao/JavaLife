import sun.rmi.server.InactiveGroupException;

import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author : neo
 * @Date 2021/3/29 19:09
 * @Description : TODO
 */
public class test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //投票同学人数
        int n = sc.nextInt();
        //i和j分别为我和小明获得的票
        int i = 0, j = 0, k;
        int max = 0;
        for (int m = 0; m < n; m++) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }
            j += x;
        }
        k = (2 * j / n) + 1;
        while (k < max) {
            k++;
        }
        System.out.println(k);


    }
}
