package Jv.courses.Clinic;
import java.util.*;
/**
 * Created by Владимир on 26.11.2015.
 * Клас Runner реализирует пользовательскую версию прогармы
 */
public class Runner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Clinic clinic =  new Clinic();
        String name;
        String namePet;
        String kindPet;
        String action="";
        String kindSearch;
        int listPosition;

        try{
            System.out.println("Hello, to you in the hospital for animals");
            clinic.forInput();
            while(!action.equals("6")){
                action = reader.next();
                switch (action) {
                    case "1":
                        System.out.println("Input name");
                        name = reader.next();
                        System.out.println("Input name pet");
                        namePet = reader.next();
                        System.out.println("what is your pet? : cat/dog");
                        kindPet = reader.next();
                        try {
                            clinic.addClient(name,namePet,kindPet);
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        clinic.forInput();
                        break;
                    case "2":
                            try {
                            clinic.show();
                            } catch (UserException e) {
                                System.out.println(e.getMessage());
                            }
                            listPosition = Integer.valueOf(reader.next());
                            System.out.println("enter the name to be changed");
                            name = reader.next();
                            clinic.forRename();
                            kindSearch = reader.next();
                            clinic.rename(kindSearch, name, listPosition);
                             clinic.forInput();
                        break;
                    case "3":
                        System.out.println("Enter a name to search");
                        name = reader.next();
                        clinic.forSearch();
                        kindSearch = reader.next();
                        try {
                            clinic.search(name,kindSearch);
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        clinic.forInput();
                        break;
                    case "4":
                        try {
                            clinic.show();
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        listPosition = Integer.valueOf(reader.next());
                            clinic.deletePatient(listPosition);
                            clinic.forInput();
                        break;
                    case "5":
                        try {
                            clinic.show();
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        clinic.forInput();
                        break;
                }
            }
            System.out.println("Bye");
        } finally {
            reader.close();
        }
    }
}

