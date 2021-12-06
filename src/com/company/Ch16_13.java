package com.company;
import java.util.*;

public class Ch16_13 {
    public static void main(String[] args) {
        String[] firstNames = {"Nick", "Arthur","John", "Dutck", "Elizabeth","Jack", "Jack"};

        List<String> list = Arrays.asList(firstNames);
        System.out.println();
        System.out.println("Array with duplicate: ");
        for (int i = 0; i < firstNames.length; i++){
            System.out.print(firstNames[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Array without duplicate: ");
        eliminateDuplicate(list);

        System.out.println();
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print(" Find by First Name --> ");
        String findFirstName = input.nextLine();

        if(findByFirstName(findFirstName, list) == true ){
            System.out.printf("First name %s exist", findFirstName);
        }
        if(findByFirstName(findFirstName, list) == false){
            System.out.printf("First name %s doesn't exist", findFirstName);
        }
        System.out.println();
    }
    public static void eliminateDuplicate(Collection<String> firstName){
        Set<String> setFirstNames = new HashSet<>(firstName);

        for (String name : setFirstNames){
            System.out.print(name+" ");
        }
    }
    public static boolean findByFirstName(String findFirstName, Collection<String> listNames){

        Set<String> set = new HashSet<>(listNames);
        return set.contains(findFirstName);
    }

}