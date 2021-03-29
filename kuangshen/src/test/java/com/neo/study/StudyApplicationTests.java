package com.neo.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Date;

@SpringBootTest
class StudyApplicationTests {

    @Test
    void contextLoads() {
        String s = "We are happy";
//#######################实现方法1：##########################
        if (s == null || "".equals(s)) {
            System.out.println("");
        }
        System.out.println(s.replaceAll(" ", "%20"));

    }


    @Test
    void dateTest() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
        String res = simpleDateFormat.format(date);
        System.out.println(res);
    }

    //bigDecimal
    @Test
    public void bigDecimalTest() {

        double i = 10.345;
        double j = 3.333;
        BigDecimal bigDecimal1 = new BigDecimal(i);
        BigDecimal bigDecimal2 = new BigDecimal(j);
        BigDecimal divide = bigDecimal1.divide(bigDecimal2,4,BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);
        // String s="helloworld";
        // String substring = s.substring(1);
        // System.out.println(substring);

    }

}
