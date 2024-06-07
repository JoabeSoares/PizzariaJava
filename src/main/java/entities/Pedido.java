package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    // Preciso receber o input do pedido do cliente
    public void recieveOrder(){
        List<String> pizzaFlavour = new ArrayList<>();
        pizzaFlavour.add("Marguerita");
        pizzaFlavour.add("Pepperoni");
        pizzaFlavour.add("Carne de sol");
        pizzaFlavour.add("Calabresa");
        pizzaFlavour.add("Mista");

        List<String> pizzaSize = new ArrayList<>();
        pizzaSize.add("Grande");
        pizzaSize.add("Média");
        pizzaSize.add("Pequena");
        pizzaSize.add("Brotinho");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código referente a pizza que deseja.");
        int flavour = scanner.nextInt();

        System.out.println("Digite o código referente ao tamanho da pizza que deseja.");
        int size = scanner.nextInt();

        String choiceFlavour = pizzaFlavour.get(flavour -1);
        String choiceSize = pizzaSize.get(size -1);

        System.out.println("-----------------------------");
        System.out.println(choiceFlavour);
        System.out.println(choiceSize);
        System.out.println("-----------------------------");

        scanner.close();
    }
}
