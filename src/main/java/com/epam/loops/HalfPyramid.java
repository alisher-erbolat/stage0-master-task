package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int c = cathetusLength;
        for (int i=1; i<=cathetusLength; i++){
            int count = i;
            String str = " ".repeat(c-1);
            while(count!=0){
                str += "*";
                count--;
            }
            count = 1;
            c--;
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
