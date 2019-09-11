import java.util.ArrayList;

/**
 * Created by laiHom on 2019/9/11.
 *数组中只出现一次的数字
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution3 {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i:array) {
            temp.add(i);
        }
          for(int i=0;i<array.length;i++){
              int flag = array[i];
              temp.remove(temp.indexOf(flag));
              int num = temp.lastIndexOf(flag);
              temp.add(array[i]);
              if(num == -1){
                  if (num1[0] == 0){
                      num1[0] = flag;
                  }else {
                      num2[0] = flag;
                  }
              }
          }
 System.out.println(num1[0]+"****"+num2[0]);
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(array,num1 ,num2);
    }
}
