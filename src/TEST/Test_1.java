package TEST;
//二维数组


import java.util.Random;

public class Test_1 {
    public static void main(String[] args) {

        int[] tempArr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Random random=new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i]+",");
        }
        System.out.println( );
        
        
        //创建二维数组
        int[][] Arr=new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            Arr[i/4][i%4]=tempArr[i];
        }
        for (int j = 0; j < Arr.length; j++) {
            for (int i = 0; i < Arr.length; i++) {
                System.out.print(Arr[j][i]+",");
            }
            System.out.println();
        }

    }
}
