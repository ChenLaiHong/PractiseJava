/**
 * Created by laiHom on 2019/6/21.
 *
 * 题目描述
 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。

 给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。

 测试样例：
 "This is nowcoder"
 返回："redocwon si sihT"
 */
public class Reverse {
    public static String reverseString(String iniString) {
        // write code here
        String result = "";
        if(iniString.length() != 0){
            for(int i=iniString.length()-1;i>=0;i--){
                result += iniString.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Reverse.reverseString("This is nowcoder"));
    }
}
