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

    public static String getFibonacciSequence(int position)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;
        String sequence ="";
        // Iterate till counter is position
        while (counter < position) {

           sequence = num1 + " ";

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return sequence;
    }




    }



