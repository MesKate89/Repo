package util;


import exseption.OldException;
import exseption.YongException;

public class AgeUtil {
    public static void checkAge(int age) {
        try {
            checkAgeYong(age);
            checkAgeOld(age);
        } catch (YongException | OldException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }

    private static void checkAgeOld ( int age) throws OldException {
        if (age >1000) {
            throw new OldException("возраст > 0");
        }
    }

    private static void checkAgeYong ( int age) throws YongException {
        if (age < 16) {
            throw new YongException("возраст меньше 0");

        }
    }

}

