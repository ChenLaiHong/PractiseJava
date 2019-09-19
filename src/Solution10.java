import java.util.Scanner;

/**
 * Created by laiHom on 2019/9/19.
 * 字符串包含
 * 输入描述:
 两个字符串，判断这个两个字符串是否具有包含关系，测试数据有多组，请用循环读入。
 输出描述:
 如果包含输出1，否则输出0.
 示例1
 输入
 abc ab
 输出
 1
 */
public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String left = scanner.next();
            String rigth = scanner.next();
            System.out.println(left.contains(rigth) || rigth.contains(left) ? 1 : 0);
        }
    }
}
