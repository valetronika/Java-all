package HW;

import java.util.Arrays;
import java.util.Set;

public class HomeWork25nov {
    public static void main(String[] args) {
        String[] levelOne = new String[100];//UPD я прочитала задание как 10,1 в первую добавить...
        levelOne[0] = String.valueOf(10.1);
        for (int i = 1; i < 100; i++) {
            levelOne[i] = String.valueOf(0);
        }
        System.out.println(Arrays.toString(levelOne));
    }

    //UPD Level One
    {
        int[] levelOneUpdate = new int[100];
        levelOneUpdate[0] = 10;
        levelOneUpdate[99] = 10;
        for (int i = 1; i < 98; i++) {
            levelOneUpdate[i] = 0;
            System.out.println(Arrays.toString(levelOneUpdate));
        }
    }
    //Level Two-------------------
    {
        String[] levelTwo = new String[100];
        levelTwo[0] = String.valueOf(0);
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 1) {
                levelTwo[i] = String.valueOf(111);
            } else if (i % 10 == 2) {
                levelTwo[i] = String.valueOf(222);
            } else if (i % 10 == 3) {
                levelTwo[i] = String.valueOf(333);
            } else {
                levelTwo[i] = String.valueOf(0);
            }
            int num = Integer.parseInt(String.valueOf(levelTwo[i]));
            sum = num + sum;
        }
        System.out.println("Sum" + sum);
    }
}



