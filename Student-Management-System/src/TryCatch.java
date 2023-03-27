import org.w3c.dom.ls.LSOutput;

import java.security.PublicKey;
import java.util.Scanner;

public class TryCatch {
    Scanner scanner = new Scanner(System.in);
    String strOption;
    String inputText;
    int option,options;
    Integer value;
    Float fValue;
    String gender;

    public String getStrOption() {
        return strOption;
    }

    public void setStrOption(String strOption) {
        this.strOption = strOption;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOptions() {
        return options;
    }

    public void setOptions(int options) {
        this.options = options;
    }

    public void tryCatchInputOnlyIntegerWithCase(int options){
            this.options = options;
            strOption = scanner.nextLine();
            try {
                option = Integer.parseInt(strOption);
                if(option<=0){
                    System.out.println("pls input positive number ..!");
                }
                if(option>options){
                    System.out.println("pls input number (1->"+options+")");
                }
            } catch (Exception ex) {
                option = 0;
                System.out.println("Invalid Input !!!");
            }
    }
    public Integer tryCatchInputOnlyInteger(String inputs){
        boolean isIDValid = false;
        do {
            String strId;
            System.out.print("Enter "+inputs+": ");
            try {
                strId = scanner.nextLine();
                value = Integer.parseInt(strId);
                if(value<=0){
                    System.out.println("pls input positive number ..!");
                }else {
                    isIDValid = true;
                }
            } catch (Exception ex) {
                System.out.println(" Invalid "+inputs+" format!! (Integer only! )");
            }
        } while (!isIDValid);
        return value;
    }
    public Float tryCatchInputOnlyFloat(String inputs){
        boolean isIDValid = false;
        do {
            String strId;
            System.out.print("Enter "+inputs+": ");
            try {
                strId = scanner.nextLine();
                fValue = Float.parseFloat(strId);
                if(fValue<=0){
                    System.out.println("pls input positive number ..!");
                }else {
                    isIDValid = true;
                }
            } catch (Exception ex) {
                System.out.println(" Invalid "+inputs+" format!! (Integer only! )");
            }
        } while (!isIDValid);
        return fValue;
    }
    public String tryCatchInputOnlyLetters(String inputs){
        boolean isIDValid = false;
        do {
            System.out.print("Enter "+inputs+":");
            try {
                inputText = scanner.nextLine();
                if (!inputText.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("Input must contain only letters");
                }
                isIDValid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred while getting  " + e.getMessage());
            }
        } while (!isIDValid);
        return inputText;
    }
    public String selectGender(){
        a:
        do {
            System.out.println("1.Male");
            System.out.println("2.Female");
            System.out.println("3.Anonymous");
            System.out.print("chose :");
            tryCatchInputOnlyIntegerWithCase(3);
            switch (option){
                case 1:gender="Male";
                    break a;
                case 2:gender="Female";
                    break a;
                case 3:gender="Anonymous";
                    break;
            }
        } while (option!=options);
        return gender;
    }
    public void pressKeyToContinue(){
        System.out.println("Press Key ToContinue ...! ");
        scanner.nextLine();
    }
}