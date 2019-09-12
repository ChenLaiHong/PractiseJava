import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by laiHom on 2019/9/12.
 * 找出重复数最多
 * 题目描述
 一个数量为N的整数数组，其中有很多重复，其中一个数字出现次数超过N/2，请将该数字找出来。
 输入描述:
 输入包含两行:
 第一行有两个整数n(1 ≤ n ≤ 100000),表示数组数字个数n
 第二行为n个整数,范围均在32位整数,以空格分隔,保证输入数据合法
 输出描述:
 输出出现次数最多的那个数
 示例1
 输入
 复制
 7 3 2 3 3 1 3 12
 输出
 复制
 3
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int temp = n/2;
        int flag = 1;
        int tempNum = array[0];
        int result = 0;
        for(int i=1;i<array.length-1;i++){
            if(tempNum != array[i]){
                tempNum = array[i];
                flag = 1;
            }else {
                flag += 1;
                if(flag >= temp){
                    result = array[i];
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
