package ro.fasttrackit.tema.lab8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercitiul 4 tema
        // Student ana = new Student("Ana", 10);
        // Student patrocle = new Student("Patrocle", 3);
        //Student gigiel = new Student("Gigi", 7);
        //Student.averageGrade();

        //Exercitiul 2 tema
      Scanner scanner = new Scanner(System.in);
      Bank myBank;
        System.out.println("Alege banca.");
        if(scanner.nextInt()==1){
            myBank=new ING();
        }else{
            myBank=new BT();
        }
        boolean exit = false;

        while(!exit){
            System.out.println("Menu: \n" +
                    "1.Sold Cont\n" +
                    "2.Withdraw\n" +
                    "3.Deposit\n" +
                    "4.Cancel Transaction\n" +
                    "Alegeti optiunea: ");
            int optiune = scanner.nextInt();
            switch (optiune){
                case 1:
                    System.out.println(myBank.printSoldCont());
                    break;
                case 2:
                    System.out.println("Ce suma doriti sa retrageti?");
                    myBank.withdrawal(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Ce suma doriti sa depozitati?");
                    myBank.deposit(scanner.nextInt());
                    break;
                case 4:
                    exit=true;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Wrong input, please try again");
            }

        }

    }
}
