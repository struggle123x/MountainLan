package assignment2;

import javax.swing.*;
import java.util.Scanner;

public class CounterTest {
    public static void main(String[] args) {
        String expression;

        Scanner input = new Scanner(System.in);
        Counter counter = new Counter();

        System.out.print("请输入算术表达式（字符之间无空格）：");
        expression = input.nextLine();

        System.out.println("计算结果为： " + counter.calculate(expression));

    }
}
