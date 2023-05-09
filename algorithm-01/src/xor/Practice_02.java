package xor;

import java.util.Scanner;

/**
 * @Author: lemon
 * @CreateTime: 2023-04-27  13:25
 * @Version: 1.0
 * 一个数组中有一种数出现了奇数次,其他数出现了偶数次,怎么找到这个数并且打印他
 */
public class Practice_02 {
    public static void main(String[] args) {
        int[] a = {1,1,1,3,3,4,4,6,6,7,7,7,7};

        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = a[i]  ^ result;
        }
        System.out.println(result);
    }
}
