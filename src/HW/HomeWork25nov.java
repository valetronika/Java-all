package HW;

import java.util.Arrays;


public class HomeWork25nov {
    public static void main(String[] args) {
        String[] levelOne = new String[100];//UPD я прочитала задание как 10,1 в первую добавить...
        levelOne[0] = String.valueOf(10.1);
        for (int i = 1; i < 100; i++) {
            levelOne[i] = String.valueOf(0);
        }
        System.out.println("LevelOne");
        System.out.println(Arrays.toString(levelOne));
    }

    //UPD Level One

    static {
        int[] levelOneUpdate = new int[100];
        levelOneUpdate[0] = 0;

        for (int i = 1; i < levelOneUpdate.length; i++) {
            levelOneUpdate[i] = 10;
        }
        levelOneUpdate[98] = 0;
        System.out.println("levelOneUpd:");
        System.out.println(Arrays.toString(levelOneUpdate));
    }

    // Level Two-------------------
    static {
        int[] levelTwo = new int[100]; //UPD тут я тоже неправильно пррочитала условие:(тут только на1,2,3 которые кончаются? можно было бы продолжить но это как то не так..
        levelTwo[0] = (0);
        int sum = 0;
        for (int x = 0; x < 100; x++) {
            if (x % 10 == 1) {
                levelTwo[x] = (111);
            } else if (x % 10 == 2) {
                levelTwo[x] = (222);
            } else if (x % 10 == 3) {
                levelTwo[x] = (333);
            } else {
                levelTwo[x] = (0);
            }
            int num = Integer.parseInt(String.valueOf(levelTwo[x]));
            sum = num + sum;
        }
        System.out.println("Sum " + sum);
        //LevelTwoUpdate
        //
        {
            int[] levelTwoUpd = new int[100];
            levelTwoUpd[0] = 111;
            int sumTwo = 0;
            for (int i = 1; i < levelTwoUpd.length; i++) {
                if (levelTwoUpd[i - 1] < 1000) {
                    levelTwoUpd[i] = levelTwoUpd[i - 1] + 111;
                } else {
                    levelTwoUpd[i] = 111;
                }
                int numTwo = levelTwoUpd[i];
                sumTwo = sumTwo + numTwo;
            }
            System.out.println("levelTwoUpd: " + Arrays.toString(levelTwoUpd));
            System.out.println("levelTwoUpd: " + sumTwo);

        }
    }
}






