import java.util.ArrayList;
import java.util.List;

/**
 * Created by laiHom on 2019/9/17.
 * 第一个只出现一次的字符
 *
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.
 */
public class Solution8 {
    public static int FirstNotRepeatingChar(String str) {
        List<String> temp = new ArrayList<>();
        for(int i=0; i < str.length(); i++){
            temp.add(String.valueOf(str.charAt(i)));
        }

        for(int i=0; i<str.length(); i++){
            if(temp.indexOf(String.valueOf(str.charAt(i))) == temp.lastIndexOf(String.valueOf(str.charAt(i)))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }
}
