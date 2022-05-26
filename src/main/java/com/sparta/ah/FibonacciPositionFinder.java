package com.sparta.ah;

public class FibonacciPositionFinder {

    public static int getPosition(int positionToFind) {
        // return zero for any negative value
        if (!(positionToFind >= 0)) {
            return 0;
        } else {
            if (positionToFind == 0) {
                return 0;
            } else if (positionToFind == 1) {
                return 1;
            } else {
                return getPosition(positionToFind - 1) + getPosition(positionToFind - 2);
            }
        }
    }
    }

