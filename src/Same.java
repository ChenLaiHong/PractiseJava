/**
 * Created by laiHom on 2019/8/2.
 * 题目描述
 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 这里规定大小写为不同字符，且考虑字符串中的空格。

 给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。
 保证两串的长度都小于等于5000。

 测试样例：
 "This is nowcoder","is This nowcoder"
 返回：true
 "Here you are","Are you here"
 返回：false
 */
public class Same {
    public static boolean checkSam(String stringA, String stringB) {
        char temp[] = new char[stringA.length()];
        if(stringA.length() == stringB.length()){
            for(int i = 0;i < stringA.length();i++){
                temp[i] = stringA.charAt(i);
            }
            for(int i = 0;i < stringA.length();i++){
                if(stringB.indexOf(temp[i]) == -1){
                    break;
                }else {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSam("Here you are","Are you here"));
    }
}
