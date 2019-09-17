/**
 * Created by laiHom on 2019/9/17.
 */
public class Solution6 {
    public static int StrToInt(String str) {
        int result = 0;
        try {
             result = Integer.valueOf(str);

        }catch (NumberFormatException e){
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt(""));
    }
}
