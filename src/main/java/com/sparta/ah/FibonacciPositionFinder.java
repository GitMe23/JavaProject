package com.sparta.ah;

public class FibonacciPositionFinder {

    public static int getPosition(int positionToFind) {
        // base case
        // return 0 for 0 or any negative value
        if (positionToFind <= 0) {
            return 0;
        }  else if (positionToFind == 1) {
                return 1;
            }
            // call method repeatedly to sum previous two positions until
            else {
                return getPosition(positionToFind - 1) + getPosition(positionToFind - 2);
            }
        }
    
    
    }


