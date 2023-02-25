package ru.netology.java5mvn.java5;

public class SQRService {
    public int calcSqr(int min, int max) {

        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) & (i * i <= max)) {
                result = result + 1;
            }
        }
        return result;
    }

}
