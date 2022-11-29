package ru.netology.sqr.squares.service;

public class SQRService {
    public int calcSqr(int upperBount, int lowerBount) {
        int answer = 0;
        for (int i = 10; i <= 99; i++) {
            int result = i * i;
            if (result >= upperBount + 1) {
                continue;
            }
            if (result <= lowerBount - 1) {
                continue;
            } else {
                answer = answer + 1;
            }

        }
        return answer;

    }

}
