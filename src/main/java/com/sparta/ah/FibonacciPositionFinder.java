package com.sparta.ah;
import java.util.ArrayList;

public class FibonacciPositionFinder {

    public static int getFibValueAtIndex(int positionToFind) {
        // base case
        // return 0 for 0 or any negative value
        if (positionToFind <= 0) {
            return 0;
        }  else if (positionToFind == 1) {
            return 1;
        }
        // call method repeatedly to sum previous two positions until
        else {
            return getFibValueAtIndex(positionToFind - 1) + getFibValueAtIndex(positionToFind - 2);
        }
    
    
    }

    public static ArrayList<Integer> getFibonacciSequence(Integer sequenceLength)
    {

        ArrayList<Integer> sequence = new ArrayList<>();

        // null check as Integer class is used
        if (sequenceLength != null && sequenceLength >= 0) {

            // from zero, call getFibValueAtIndex() for i
            for (int i = 0; i <= sequenceLength; i++){
                sequence.add(getFibValueAtIndex(i));
            }

        } else{
            sequence.add(0);
        }
        return sequence;
    }

}

