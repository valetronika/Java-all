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
        levelOneUpdate[0] = 0;

        for (int i = 1; i < levelOneUpdate.length; i++) {
            levelOneUpdate[i] = 10;
        }
        levelOneUpdate[98] = 0;
        System.out.println(Arrays.toString(levelOneUpdate));
    }

    //    Level Two-------------------
    {
        int[] levelTwo = new int[100]; //UPD тут я тоже неправильно пррочитала условие:(тут только на1,2,3 которые кончаются? можно было бы продолжить но это как то не так..
        levelTwo[0] = (0);
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 1) {
                levelTwo[i] = (111);
            } else if (i % 10 == 2) {
                levelTwo[i] = (222);
            } else if (i % 10 == 3) {
                levelTwo[i] = (333);
            } else {
                levelTwo[i] = (0);
            }
            int num = Integer.parseInt(String.valueOf(levelTwo[i]));
            sum = num + sum;
        }
        System.out.println("Sum " + sum);
        //        LevelTwoUpdate
//        int[] levelTwoUpd = new int[100];
//        levelTwoUpd[0] = ((0));
//        int sumTwo = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i%10 == 1)
//
//        }
//        System.out.println(Arrays.toString(levelTwoUpd));
        }

    }




