import org.junit.Test;

/**
 * @Description Author neo
 * Date 2021/3/12 17:08
 */
public class MyTest {

    @Test
    public void test() {
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        int[] score = num;
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
    }
}
