package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.print(number%10);
        number = number/10;
        System.out.print(number%10);
        number = number/10;
        System.out.println(number%10);
    }

}
