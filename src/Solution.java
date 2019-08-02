/**
 * Created by laiHom on 2019/8/2.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution {
    public static int JumpFloor(int target) {
        int result = 0;
        if(target==1 || target==2){
            return target;
        }else {
            result += JumpFloor(target-1)+JumpFloor(target-2);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(JumpFloor(4));
    }
}
