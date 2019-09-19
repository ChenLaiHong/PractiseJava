import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by laiHom on 2019/9/19.
 * 输入描述:
 每个测试用例的第一行是一个正整数M（1<=M<=100)，表示数据集的样本数目

 接下来输入M行，每行是数据集的一个样本，每个样本均是字符串，且后六位是数字字符。
 输出描述:
 对每个数据集，输出所有样本的后六位构成的数字排序后的结果（每行输出一个样本的结果）
 示例1
 输入
 复制
 4
 abc123455
 boyxx213456
 cba312456
 cdwxa654321
 输出
 复制
 123455
 213456
 312456
 654321
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] temp = new String[n];
        for(int i=0; i< n; i++){
            temp[i] = scanner.next();
        }

        int[] result = new int[n];
        for(int i=0; i< n; i++){
            result[i] = Integer.parseInt(temp[i].substring(temp[i].length()-6,temp[i].length()));
        }
        Arrays.sort(result);
        for (int i:result) {
            System.out.println(i);
        }

    }
}
