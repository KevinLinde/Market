import java.util.*;

/**
 * Author Kevin Linde
 * 2021-10-24
 * Peruvian Market
 */

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to Montoya's Peruano Comida, Please enter your name! ");
        String name = in.nextLine();

        int userChoice;
        final double TAX = 1.05;
        double total = 0;

        String[] menuItems = {"Tallarines Verde", "Arroz Con Pollo ", "Papa La Huancaina ", "Pan Con Chicharron ", "Arroz con Platano", "Bisket Al Lo Pobre ", "Tallarin Saltado"};
        int[] price = {20, 15, 14, 14, 15, 17, 16};
        boolean continueShopping = true;

        while(continueShopping == true){

            System.out.println("What would you like to order today " + name +"?");

            System.out.println("Choice"+ "\t\t\t"+"Menu Items" + "\t\t\t\t" + "Price");
            for(int x = 0; x < menuItems.length; x++){
                System.out.println((x+1) +"\t\t\t\t"+ menuItems[x] +"\t\t"+" $"+price[x]);
            }//Menu print

            for(int y = 0; y < 1; y++){
                //Error handling
                try{
                    userChoice = in.nextInt();
                    if(userChoice > menuItems.length || userChoice < 1){
                        System.out.println("That is not an option");
                    }
                    else{
                        total += price[userChoice - 1];
                    }
                } catch (Exception e) {
                    System.out.println("Not a option!");
                    in.next();
                    y = y - 1; //reset
                }
            }//for loop()
            System.out.println("Would you like to continue? [Yes/No]");
            String contOption = in.next();

            switch(contOption.toLowerCase()){
                case "yes" -> continueShopping = true;
                case "no" ->  continueShopping = false;
                default -> System.out.println("Not an option");
                }//switch()

        }//while()
        System.out.println("Thank you for ordering "+ name + "! Your total is: $"+total);
    }
}

