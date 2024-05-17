package org.example;

import entities.Menu;
import entities.Sabores;
import entities.Tamanhos;

public class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo a pizzaria do Jow.");
        System.out.println("-----------------------------");

        Menu menu = new Menu();


        System.out.println("O sabor da sua pizza é: " + Sabores.CALABRESA);
        System.out.println("Preço: " + Tamanhos.GRANDE.getMult() * Sabores.CALABRESA.getPreco());
        System.out.println("O sabor da sua pizza é: " + Sabores.MARGHERITA);
        System.out.println("Preço: " + Tamanhos.BROTINHO.getMult() * Sabores.MARGHERITA.getPreco());
        System.out.println("O sabor da sua pizza é: " + Sabores.CARNE_DE_SOL);
        System.out.println("Preço: " + Tamanhos.PEQUENA.getMult() * Sabores.CARNE_DE_SOL.getPreco());
        System.out.println("O sabor da sua pizza é: " + Sabores.MISTA);
        System.out.println("Preço: " + Tamanhos.GRANDE.getMult() * Sabores.MISTA.getPreco());
        System.out.println("O sabor da sua pizza é: " + Sabores.PEPPERONI);
        System.out.println("Preço: " + Tamanhos.MEDIA.getMult() * Sabores.PEPPERONI.getPreco());

    }
}
