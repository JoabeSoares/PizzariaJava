package org.example;

import entities.Menu;
import entities.Pedido;
import entities.Pizza;
import entities.Sabor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    //Tenho que receber o pedido
//        System.out.println("Quantas pizzas você deseja pedir? ");
//        Scanner scanner = new Scanner(System.in);
//        int quantidade = scanner.nextInt();
//        System.out.println("Você pediu " + quantidade + " pizzas.");
//
//        Pizza pizza = new Pizza();
//
//
//        System.out.println(pizza.getSabor1());
//        System.out.println(pizza.getPreco());

    Scanner scanner = new Scanner(System.in);

    String[] sabor = {"1 - Calabresa", "2 - Carne de sol", "3 - Pepperoni"};

    System.out.println("MENU\n" +
            "------------------------");
    for(int i = 0; i < sabor.length; i++) {
        System.out.println(sabor[i]);
    }

    Menu menu = new Menu();
    menu.printMenu();
    System.out.println("------------------------");
    System.out.println("Sabor escolhido: " + menu.saboresPizza);
//    Pizza pizza1 = new Pizza();
//    String sabor1 = scanner.nextLine();
//    String sabor2 = scanner.nextLine();
//    String tamanho = scanner.nextLine();
//    double preco = scanner.nextDouble();

//    pizza1.setSabor1(sabor1);
//    pizza1.setSabor2(sabor2);
//    pizza1.setTamanho(tamanho);
//    pizza1.setPreco(preco);

//    Pizza pizza2 = new Pizza();
//    sabor1 = scanner.nextLine();
//    sabor2 = scanner.nextLine();
//    tamanho = scanner.nextLine();
//    preco = scanner.nextDouble();
//
//    pizza2.setSabor1(sabor1);
//    pizza2.setSabor2(sabor2);
//    pizza2.setTamanho(tamanho);
//    pizza2.setPreco(preco);

//    pizza1.setSabor1("Groselha");
//    pizza1.setSabor2("Salmão");
//    pizza1.setTamanho("Grande");
//    pizza1.setPreco(150);

//    Pizza pizza2 = new Pizza();
//    pizza2.setSabor1("Carne de sol");
//    pizza2.setSabor1("Quatro queijos");
//    pizza2.setTamanho("Brotinho");
//    pizza2.setPreco(10);
//

//    pedido.addPizza(pizza1);
//    pedido.addPizza(pizza2);

//    System.out.println("-----------------------------------------------------------");
//    System.out.println("Metade 1: " + pizza1.getSabor1());
//    System.out.println("Metade 2: " + pizza1.getSabor2());
//    System.out.println("Tamanho: " + pizza1.getTamanho());
//    System.out.println("O valor total do pedido é: R$"+ pedido.totalConta());
//    System.out.println("-----------------------------------------------------------");

//    System.out.println("-----------------------------------------------------------");
//    System.out.println("Metade 1: " + pizza2.getSabor1());
//    System.out.println("Metade 2: " + pizza2.getSabor2());
//    System.out.println("Tamanho: " + pizza2.getTamanho());
//    System.out.println("O valor total do pedido é: R$"+ pedido.totalConta());
//    System.out.println("-----------------------------------------------------------");



    }
}
