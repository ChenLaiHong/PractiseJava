import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by laiHom on 2019/7/31.
 * 题目描述
 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”
 经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。

 给定一个string iniString为待压缩的串(长度小于等于10000)，保证串内字符均由大小写英文字母组成，
 返回一个string，为所求的压缩后或未变化的串。

 测试样例
 "aabcccccaaa"
 返回："a2b1c5a3"
 "welcometonowcoderrrrr"
 返回："welcometonowcoderrrrr"
 */
public class Zipper {
    public static String zipString(String iniString) {
        String result = "";
        boolean flag = false;
        if(iniString.length()>0){
            int tempNum = 1;
            String temp = "";
            for(int i=0; i<iniString.length();i++){
                temp = iniString.charAt(i)+"";
               if(i+1 != iniString.length()) {
                   if (temp.equals(iniString.charAt(i + 1) + "")) {
                       tempNum += 1;
                   } else {
                       result += temp + tempNum;
                       tempNum = 1;
                   }
               }else {
                   result += temp + tempNum;
               }
            }

        }
        if(result.length() >= iniString.length()){
            return iniString;
        }else {
            return result;
        }

    }

    public static void main(String[] args) {
        System.out.println(zipString("welcometonowcoderrrrr"));
        System.out.println(zipString("aabcccccaaa"));
    }
}
