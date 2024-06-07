package org.example;

import entities.Menu;
import entities.Pedido;
import entities.Sabores;
import entities.Tamanhos;

public class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo a pizzaria do Jow.");
        System.out.println("-----------------------------");

        Menu menu = new Menu();
        Pedido order = new Pedido();
        menu.showMenu();
        menu.showSize();
        order.recieveOrder();



    }
}
