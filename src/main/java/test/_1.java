package test;

import java.util.Scanner;

/**
 * Created by admin on 2016/5/25.
 */
public class _1 {
    public static void main(String[] args)
    {
        int iMax = Integer.MAX_VALUE; // = 2147483647
        int iMin = Integer.MIN_VALUE; // = -2147483648
        System.out.println("最大的 int ：" + iMax);
        System.out.println("最小的 int ：" + iMin);
        System.out.println("最大的 int 加 1 ：" + (iMax + 1)); // 1
        System.out.println("最小的 int 减 1 ：" + (iMin - 1)); // 2
        int ia = 50000;
        int ib = 60000;
        System.out.println("两个不太大的 int 相乘 ：" + ia * ib); // 3
    }


}
