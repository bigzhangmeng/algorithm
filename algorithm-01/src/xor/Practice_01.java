package xor;

/**
 * @Author: lemon
 * @CreateTime: 2023-04-27  13:22
 * @Version: 1.0
 *
 * 交换两个数
 */
public class Practice_01 {
    public static void main(String[] args) {
        int a = 13;
        int b = 45;
        String x = Integer.toBinaryString(a);
        String y = Integer.toBinaryString(a);
        a = a^ b;
        b = a^ b;
        a = a^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
