import java.util.Arrays;

/**
 * Created by laiHom on 2019/9/17.
 */
public class Solution7 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null ){
            return false;
        }
        Arrays.sort(numbers);
        int temp2 = 0;
        for(int i=0; i<length-1; i++){
            if(numbers[i] == numbers[i+1]){
                duplication[0] = numbers[i];
                temp2 = 1;
                break;
            }
        }
        return temp2 == 1 ? true : false;
    }
}
