package task2_main;

import task2.Rainbow;

import java.util.Scanner;

public class Main {

  public static void main(String [] args){
      Rainbow rainbow = new Rainbow();
    Scanner input = new Scanner(System.in);
    while (true) {
    System.out.println("Какой цвет радуги по счету выбираете (от 1 до 7): ");


    rainbow.setIndex((int) input.nextInt());
    System.out.println(rainbow.getRainbow());
}
/*
на самом деле не успел сделать полуцвета, очень поздно заканчивал.
вопрос в лучшем методе реализации, но если про простому то можно просто дописать их в массив
и добавить чисел, а пользователю объяснить это в условиях выбора
 */





  }
}
