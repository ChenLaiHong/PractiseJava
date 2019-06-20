

import java.util.ArrayList;
import java.util.Arrays;

/**最小发K个数
 * Created by laiHom on 2019/6/20.
 *
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */

public class First {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList list = new ArrayList();
        if(input.length >= k){
            for(int i=0;i<k;i++){
                list.add(input[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int number[] = {4,5,1,6,2,7,3,8};
        int k = 10;
        ArrayList<Integer> result = First.GetLeastNumbers_Solution(number,k);
        if (result.size() != 0){
            for(int i=0;i<k;i++){
                System.out.println(result.get(i)+" ");
            }
        }else {
            System.out.println(result);
        }
    }
}
