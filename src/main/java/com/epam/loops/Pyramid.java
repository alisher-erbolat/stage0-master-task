package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int c = cathetusLength;
        for (int i=1; i<=cathetusLength; i++){
            int count = i;
            String str = " ".repeat(c-1);
            while(count!=0){
                str += count;
                count--;
            }
            count = 1;
            while(count!=i+1){
                if (count==1){

                }
                else{
                    str += count;
                }
                count++;
            }
            c--;
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
