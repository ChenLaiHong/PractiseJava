/**
 * Created by laiHom on 2019/7/31.
 * 题目描述
 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。

 给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于500，图像元素小于等于256。

 测试样例：
 [[1,2,3],[4,5,6],[7,8,9]],3
 返回：[[7,4,1],[8,5,2],[9,6,3]]
 */
public class Transform {
    public static int[][] transformImage(int[][] mat, int n) {
        int result[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[i][j] = mat[n-j-1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result[][] = new int[3][3];
        int number = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j] = number;
                number +=1;
            }

        }
        int temp[][] = null;
       temp = transformImage(result,3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(temp[i][j]);

            }
            System.out.println();
        }
    }
}
