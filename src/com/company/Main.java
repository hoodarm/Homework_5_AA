package com.company;

public class Main {

    public static void main(String[] args) {
        int [] data = {9, 7, 2, 11};
        InsertionSort(data);
        for (int el:data)
            //printing and taking care of the space
            if (el!=data[data.length-1])
                System.out.print(el + " ");
            else
                System.out.println(el);
    }

    static void InsertionSort (int [] input){
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

            //printing the intermediate steps
            for (int el: input)
                System.out.print(el + " ");
            System.out.println();
        }
    }
}