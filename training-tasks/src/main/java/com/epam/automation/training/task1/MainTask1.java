package com.epam.automation.training.task1;

import java.util.Scanner;


public class MainTask1 {

    public static void menu1() {
    	
    	//для проверки и замены на нормальный человеческий ввод
    	int numberof = 5;
    	String[] array = {"1","9","7"};
    	switch (numberof) {
        case  (1):
            task1();
            break;
        case (2):
        	task2(array);
        	break;
        case (3):
            task3(5);
            break;
        case (4):
        	task4(array);
        	break;
        case (5):
            task5(5);
            break;
        	}
    }
	
	//1.Приветствовать любого пользователя при вводе его имени через командную строку
    public static void task1() {
      System.out.println("Oh, hello! Please, enter your name here: ");
      Scanner userName = new Scanner(System.in);
      System.out.println("Hello, " + userName.nextLine() + ", nice to meet you!");
    }
    
    //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

        public static void task2(String[] args) {
        	System.out.print("Числа в обратном порядке:");
            for( int i = args.length - 1 ; i >= 0 ; i--)
                System.out.print(" " + args[i]);
        }
    
    //3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void task3(int count) {
    	//Math.random() * (b-a) ) + a
        for (int i = 0; i < count; i++) {
            int random_number1 = 0 + (int) (Math.random() * 100);
            System.out.print(" " + random_number1);
        }
    }
    
    //Ввести целые числа как аргументы командной строки, 
    //подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void task4(String[] args) {
    	int summ=0, product=1; 
    	for(int i=0; i<args.length; i++){
    			int numInt=Integer.parseInt(args[i]);
    			summ=summ + numInt;
    			product=product * numInt;
    		}
    	System.out.println("Сумма чисел: " + summ);
    	System.out.println("Произведение чисел: "+ product);
    }
    
    //5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. 
    //Осуществить проверку корректности ввода чисел.
    static void task5(int choosedMonth){
        String[] allMonth = {"Январь", "Феваль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        if (choosedMonth>0 && choosedMonth<13) {
        	System.out.println("Выбран месяц: " + allMonth[choosedMonth-1] + ".");
        } else System.out.println("Месяца под таким номером, к сожалению, не существует.");
    }
}
	

