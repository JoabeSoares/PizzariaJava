package entities;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public Menu() {

    }

//    public void menuPizza() {
//        System.out.println("Escolha o sabor da sua pizza: \n" +
//                "1 - Calabresa\n"+
//                "2 - Pepperoni\n"+
//                "3 - Carne de sol\n");



//    public void tamanhoPizza() {
//        System.out.println("Escolha o tamanho da sua pizza: \n"+
//                "Grande\n"+
//                "Média\n"+
//                "Pequena\n");
//
//    }

    // Adicionar sabor
    Sabor sabor = new Sabor();
    public void printMenu(){
    }

    // Receber um input do usuário e retornar uma pizza com o sabor escolhido
    public String saboresPizza;
    public void userOption() {
        System.out.println("Escolha o sabor da sua pizza: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        saboresPizza = option;
        sabor.addSabor(option);
        scanner.close();
    }


}
