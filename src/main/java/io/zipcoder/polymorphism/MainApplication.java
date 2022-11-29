package io.zipcoder.polymorphism;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numPets = scanner.nextInt();
        scanner.nextLine();

        Pet[] petsOwned = new Pet[numPets];
        ArrayList<Pet> petsOwnedList = new ArrayList<Pet>();

        for(int i = 0; i < numPets; i++){
            System.out.println("Type of pet?");
            String type = scanner.nextLine();

            System.out.println("Name of pet?");
            String name = scanner.nextLine();

            petsOwnedList.add(petFromInput(type, name));
        }

        for(Pet pet : petsOwnedList){
            System.out.println(pet.getName() + " says ");
            pet.speak();
        }
    }

    public static Pet petFromInput(String type, String name){
        if (type.equalsIgnoreCase("dog")){
            return new Dog(name);
        }
        else if(type.equalsIgnoreCase("cat")){
            return new Cat(name);
        }
        else if(type.equalsIgnoreCase("fish")){
            return new Fish(name);
        }
        else{
            return null;
        }
    }
}