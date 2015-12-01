package Jv.calc.Calculate;
import java.util.Scanner;

public class InteractRunner{

    public static void main(String[]args){
        Scanner reader=new Scanner(System.in);
        String operation="";
        int second;
        int first;
        try{
            Calculator calc = new Calculator();
            System.out.println("Calculator open");
            calc.inputOperation();
            while(!operation.equals("5")) {
                operation = reader.next();
                switch (operation) {
                    case "1":
                        if(calc.saveResult){
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.add(second);
                        }
                        else {
                            System.out.println("Input first arg");
                            first = Integer.valueOf(reader.next());
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.add(first,second);

                        }
                        System.out.println(calc.getResult());
                        System.out.println("Save result? : yes/no");
                        try {
                            calc.setSaveResult(reader.next());
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        calc.inputOperation();
                        break;

                    case "2":
                        if(calc.saveResult){
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.sub(second);
                        }
                        else {
                            System.out.println("Input first arg");
                            first = Integer.valueOf(reader.next());
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.sub(first, second);

                        }
                        System.out.println(calc.getResult());
                        System.out.println("Save result? : yes/no");
                        try {
                            calc.setSaveResult(reader.next());
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Input yes/no");
                        }
                        calc.inputOperation();
                        break;

                    case "3":
                        if(calc.saveResult){
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.div(second);
                        }
                        else {
                            System.out.println("Input first arg");
                            first = Integer.valueOf(reader.next());
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                                calc.div(first, second);

                        }
                        System.out.println(calc.getResult());
                        System.out.println("Save result? : yes/no");
                        try {
                            calc.setSaveResult(reader.next());
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        calc.inputOperation();
                        break;

                    case "4":
                        if(calc.saveResult){
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.mult(second);
                        }
                        else {
                            System.out.println("Input first arg");
                            first = Integer.valueOf(reader.next());
                            System.out.println("Input second arg");
                            second = Integer.valueOf(reader.next());
                            calc.mult(first, second);

                        }
                        System.out.println(calc.getResult());
                        System.out.println("Save result? : yes/no");
                        try {
                            calc.setSaveResult(reader.next());
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                        calc.inputOperation();
                        break;
                }


            }
            System.out.println("Bye");
        }finally{
                reader.close();
        }
    }
}
