package com.mycompany.practic1_6;
import java.util.Scanner;

public class Practic1_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type name of the phone manufacturer");
        String hehe = scanner.nextLine();
        Telephone telephone = new Telephone(hehe);
        Seller seller = new Seller();
        seller.modify(telephone);
        System.out.println("Answer: " + telephone.gethehe() + ", " + hehe);
    }
}
