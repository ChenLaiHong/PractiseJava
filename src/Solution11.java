import java.util.Scanner;

/**
 * Created by laiHom on 2019/9/24.
 * 题目描述
 给定一个12小时制的时间，请将其转换成24小时制的时间。说明：12小时制的午夜12：00：00AM，对应的24小时制时间为00：00：00。
 12小时制的中午12：00：00PM，对应的24小时制时间为12：00：00。
 输入描述:
 一个描述12小时制时间的字符串。所有的输入都是合理的，不用考虑输入不合理的情况。
 输出描述:
 一个描述24小时制时间的字符串。
 示例1
 输入
 08:03:45PM
 输出
 20:03:45
 */
public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String flag = time.substring(time.length()-2);
        String timeStr = time.substring(0,time.length()-2);
        int hour = Integer.parseInt(time.substring(0,2));
        if(flag.equals("AM")){
            if(hour == 12){
                System.out.println("00"+timeStr.substring(2));
            }else {
                System.out.println(timeStr);
            }

        }else {
            if(hour == 12){
                System.out.println("12"+timeStr.substring(2));
            }else {
                String new_hour = String.valueOf(12 + hour);
                System.out.println(new_hour+""+timeStr.substring(2));
            }

        }

    }
}
