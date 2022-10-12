package com.company;

public class Main {

    public static void main(String[] args) {
        int [] data = {9, 7, 2, 11};
        int [] changed_Data = InsertionSort(data);
        for (int el:changed_Data)
            //printing and taking care of the space
            if (el!=changed_Data[changed_Data.length-1])
                System.out.print(el + " ");
            else
                System.out.println(el);
    }

    static int [] InsertionSort (int [] input){
        int I = 1;
        while (I<input.length)
        {
            int VAL = input[I];
            int J = I-1;
            while (J>=0&&input[J]>VAL)
            {
                input[J+1]=input[J];
                J--;
            }
            input[J+1]=VAL;
            I++;
        }
        return input;
    }
}