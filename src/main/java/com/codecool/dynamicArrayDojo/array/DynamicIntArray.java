package com.codecool.dynamicArrayDojo.array;

// put your code here!
public class DynamicIntArray {

    int[] array;

    public DynamicIntArray () {
        array = new int[0];
    }

    public DynamicIntArray (int size) {
        array = new int[size];
    }

    @Override
    public String toString() {
        int size = array.length;
        String stringsInt = "";
        for (int i=0; i<size; i++) {
            String string = String.valueOf(array[i]);
            stringsInt += " " + string;
        }
        return stringsInt;

    }


    public int[] add(int number) {

        int extendSize = array.length + 1;
        int lastIndex = array.length;
        int[] extendArray = new int[extendSize];

        for (int i=0; i<lastIndex; i++) {
            extendArray[i] = array[i];
        }

        extendArray[lastIndex] = number;
        array = extendArray;

        return array;
    }

    public int[] remove(int number) {

        if (number<0 || number > array.length-1) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        int shrinkSize = array.length - 1;
        int lastIndex = array.length - 2;
        int[] shrinkArray = new int[shrinkSize];

        for (int i=0; i<=lastIndex; i++) {
            if (i < number) {
                shrinkArray[i] = array[i];
            } else {
                shrinkArray[i] = array[i+1];
            }

        }

        array = shrinkArray;

        return array;
    }

    public int[] insert(int index, int number) {
        int extendSize = array.length + 1;
        int lastIndex = array.length;
        int[] extendArray = new int[extendSize];

        if (index>lastIndex) {
            for (int i=0; i<lastIndex; i++) {
                extendArray[i] = array[i];
            }
            extendArray[lastIndex] = number;
        } else {
            for (int i=0; i<extendArray.length; i++) {
                if (i<index) {
                    extendArray[i] = array[i];
                } else if (i == index) {
                    extendArray[i] = number;
                } else {
                    extendArray[i] = array[i-1];
                }
            }
        }

        array = extendArray;

        return array;
    }



}
