package com.epam.automation.training.task1;

import java.util.Scanner;


public class MainTask1 {

	//1.Приветствовать любого пользователя при вводе его имени через командную строку
    public static void task1() {
      System.out.println("Oh, hello! Please, enter your name here: ");
      Scanner userName = new Scanner(System.in);
      for (int i = 0; true; i++) {
        System.out.println("Hello, " + userName.nextLine() + ", nice to meet you!");
        }
    }
	
}
