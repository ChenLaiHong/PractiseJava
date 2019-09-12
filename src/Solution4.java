import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by laiHom on 2019/9/12.
 * 和为S的两个数字
 * 目描述
 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 如果有多对数字的和等于S，输出两个数的乘积最小的。
 输出描述:
 对应每个测试案例，输出两个数，小的先输出。
 */
public class Solution4 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int[] result = new int[2];
        int temp = Integer.MAX_VALUE;
        int flag = 0;
        for(int i=array.length-1; i>=0; i--){
            if(array[i] < sum){
                for(int j=0; j < i;j++){
                    if(array[i]+array[j] == sum){
                        if(array[i]*array[j] < temp){
                            temp = array[i]*array[j];
                            result[0] = array[i];
                            result[1] = array[j];
                            flag += 1;
                        }
                    }else {
                        continue;
                    }
                }
            }else {
                continue;
            }
        }
        ArrayList<Integer> finalResult = new ArrayList<>();
        if(flag >= 1){
            Arrays.sort(result);
            for(int i=0; i<result.length;i++){
                finalResult.add(result[i]);
            }
        }

        return finalResult;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,7,11,15};
        int sum = 15;
        System.out.println(FindNumbersWithSum(array,sum));
    }
}
