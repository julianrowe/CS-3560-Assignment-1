// Julian Rowe
// CS 3560.03
// September 29, 2022

import java.util.Random;

public class Student{
    // generates a random ID with the same first few digits similar to CPP ID#
    static String generateUniqueID(){
        Random random = new Random();
        int randomIDEnding = random.nextInt(999999 - 100000 + 1) + 100000;
        String uniqueID = "012" + randomIDEnding;
        return uniqueID;
    }
}