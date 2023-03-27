import java.util.ArrayList;
import java.util.Scanner;

public class Main{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         TryCatch tryCatch= new TryCatch();
         ArrayList <Students> newStudents = new ArrayList<>();

         ArrayList<Students> student = new ArrayList<>(){{
             add(new Students(1,"koko","female","data",18,90f));
             add(new Students(2,"lulu","male","devops",21,50f));
             add(new Students(3,"kimhong","female","data",21,40f));
             add(new Students(4,"long","male","oop",20,90f));
             add(new Students(5,"jonh","female","data",23,70f));

         }};
        do {
            System.out.println("--------------- Students Management System ------------------");
            System.out.println("1. Add new Student ");
            System.out.println("2. Edit Student information ");
            System.out.println("3. Delete Student profile");
            System.out.println("4. Search Student profile");
            System.out.println("5. Show Student information ");
            System.out.println("6. Exit");
            System.out.print("---> Choose option from 1 - 6 : ");
            tryCatch.tryCatchInputOnlyIntegerWithCase(6);
            switch (tryCatch.getOption()) {
                case 1:
                    Students newstudent = new Students();
                    System.out.println("\t\t\t\t\t\t========================");
                    System.out.println("\t\t\t\t\t\t|\t  Add new student   |");
                    System.out.println("\t\t\t\t\t\t========================");
                    newstudent.inputInformention();
                    for(int i=0 ;i<student.size();i++) {
                        if (newstudent.getId() ==student.get(i).getId()) {
                            newStudents.add(student.get(i));
                        }
                    }
                    if(newStudents.size()>0){
                        System.out.println("Student ID:"+newstudent.getId()+"Have already...!");
                        newStudents.clear();
                    }
                    else {
                        student.add(newstudent);
                        System.out.println("Successful ...");
                    }
                    break;
                case 2:
                    if(student.size()>0) {
                        System.out.println("**********************Edit Student information********************** ");
                        Integer searchID = tryCatch.tryCatchInputOnlyInteger("ID");
                        for (int i = 0; i < student.size(); i++) {
                            if (searchID == student.get(i).getId()) {
                                newStudents.add(student.get(i));
                            }
                        }
                        if (newStudents.size()>=0){
                            System.out.println("\t\t\t\t\t\t=============================");
                            System.out.println("\t\t\t\t\t\t|\tEdit student informention |");
                            System.out.println("\t\t\t\t\t\t=============================");
                            for (int i = 0; i < student.size(); i++) {
                                if (searchID == student.get(i).getId()) {
                                 student.get(i).inputInformention();
                                }
                            }
                        }
                        else {
                            System.out.println("Student with ID = " + searchID + " doesn't exist !!!");
                        }
                    }
                    else {
                        System.out.println("Doesn't Have student Here...!");
                    }
                    break;
                case 3:
                        if (student.size()>0) {
                            do {
                                System.out.println("**********************Delete Student**********************");
                                System.out.println("1.Delete Search By ID");
                                System.out.println("2.Delete By Name");
                                System.out.println("3.Delete By Gender");
                                System.out.println("4.Delete By Class name");
                                System.out.println("5. Exit");
                                System.out.print("--> Choose option from 1 - 5 : ");
                                tryCatch.tryCatchInputOnlyIntegerWithCase(5);
                                switch (tryCatch.getOption()) {
                                    case 1:
                                        System.out.println("1.Delete By ID");
                                        Integer searchId = tryCatch.tryCatchInputOnlyInteger("ID");
                                        for (int i = 0; i < student.size(); i++) {
                                            if (searchId == student.get(i).getId()) {
                                                newStudents.add(student.get(i));
                                            }
                                        }
                                        if (newStudents.size()>0){
                                            for (int i=0 ;i<student.size() ;i++){
                                                if (searchId == student.get(i).getId()) {
                                                    System.out.println("Deleted Student with ID" + student.get(i).outputInformention() + " Successfully .....!");
                                                    student.remove(i);
                                                }
                                            }
                                            newStudents.clear();
                                        }
                                        else {
                                            System.out.println("Doesn't Have student ID:" + searchId + " Here...!");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("2.Delete By Name");
                                        String searchName = tryCatch.tryCatchInputOnlyLetters("Name");
                                        for (int i = 0; i < student.size(); i++) {
                                            if (student.get(i).getName().equalsIgnoreCase(searchName)) {
                                                newStudents.add(student.get(i));
                                            }
                                        }
                                        if (newStudents.size()>0){
                                            for (int i=0 ;i<student.size() ;i++){
                                                if (student.get(i).getName().equalsIgnoreCase(searchName)){
                                                    System.out.println("Deleted Student with ID" + student.get(i).outputInformention() + " Successfully .....!");
                                                    student.remove(i);
                                                }
                                            }
                                            newStudents.clear();
                                        }
                                        else {
                                            System.out.println("Doesn't Have student ID:" + searchName + " Here...!");
                                        }
                                        break;
                                    case 3:
                                            System.out.println("3.Delete By Gender");
                                            String searchGender = tryCatch.tryCatchInputOnlyLetters("Gender");
                                            for (int i = 0; i < student.size(); i++) {
                                                if (student.get(i).getGender().equalsIgnoreCase(searchGender)) {
                                                    newStudents.add(student.get(i));
                                                }
                                            }
                                            if (newStudents.size()>0){
                                                for (int i=0 ;i<student.size() ;i++){
                                                    if (student.get(i).getGender().equalsIgnoreCase(searchGender)){
                                                        System.out.println("Deleted " + student.get(i).outputInformention() + " Successfully .....!");
                                                        student.remove(i);
                                                    }
                                                }
                                                newStudents.clear();
                                            }
                                            else {
                                                System.out.println("Doesn't Have student ID:" + searchGender + " Here...!");
                                            }
                                        break;
                                    case 4:
                                        System.out.println("4.Search By Class name");
                                        String searchClassName = tryCatch.tryCatchInputOnlyLetters("Class Name");
                                        for (int i = 0; i < student.size(); i++) {
                                            if (student.get(i).getClassName().equalsIgnoreCase(searchClassName)) {
                                                newStudents.add(student.get(i));
                                            }
                                        }
                                        if (newStudents.size()>0){
                                            for (int i=0 ;i<student.size() ;i++){
                                                if (student.get(i).getClassName().equalsIgnoreCase(searchClassName)){
                                                    System.out.println("Deleted " + student.get(i).outputInformention() + " Successfully .....!");
                                                    student.remove(i);
                                                }
                                            }
                                            newStudents.clear();
                                        }
                                        else {
                                            System.out.println("Doesn't Have student ID:" + searchClassName + " Here...!");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Exit....");
                                        break;
                                }
                            } while (tryCatch.getOption() != tryCatch.options);
                            tryCatch.setOptions(0);
                        }else {
                            System.out.println("Doesn't Have student Here...!");
                        }
                    break;
                case 4:
                    do {
                        System.out.println("**********************Search Student profile**********************");
                        System.out.println("1.Search By ID");
                        System.out.println("2.Search By Name");
                        System.out.println("3.Search By Gender");
                        System.out.println("4.Search By Class name");
                        System.out.println("5. Exit");
                        System.out.print("--> Choose option from 1 - 5 : ");
                        tryCatch.tryCatchInputOnlyIntegerWithCase(5);
                        switch (tryCatch.getOption()) {
                            case 1:
                                if (student.size() > 0) {
                                    System.out.println("1.Search By ID");
                                    Integer searchId = tryCatch.tryCatchInputOnlyInteger("ID");
                                    System.out.println("\t\t\t\t\t\t=============================");
                                    System.out.println("\t\t\t\t\t\t|\t   student informention   |");
                                    System.out.println("\t\t\t\t\t\t=============================");
                                    for (int i = 0; i < student.size(); i++) {
                                        if (searchId == student.get(i).getId()) {
                                            newStudents.add(student.get(i));
                                        }
                                    }
                                    if (newStudents.size() > 0) {
                                        for (int i = 0; i < newStudents.size(); i++) {
                                            System.out.println(newStudents.get(i).outputInformention());
                                        }
                                        newStudents.clear();
                                        tryCatch.pressKeyToContinue();
                                    } else {
                                        System.out.println("Doesn't Have student ID:" + searchId + " Here...!");
                                    }
                                } else {
                                    System.out.println("Doesn't Have student Here...!");
                                }
                                break;
                            case 2:
                                if (student.size() > 0) {
                                    System.out.println("2.Search By Name");
                                    String searchName = tryCatch.tryCatchInputOnlyLetters("Name");
                                    System.out.println("\t\t\t\t\t\t=============================");
                                    System.out.println("\t\t\t\t\t\t|\t   student informention   |");
                                    System.out.println("\t\t\t\t\t\t=============================");
                                    for (int i = 0; i < student.size(); i++) {
                                        if (student.get(i).getName().equalsIgnoreCase(searchName)) {
                                            newStudents.add(student.get(i));
                                        }
                                    }
                                    if (newStudents.size() > 0) {
                                        for (int i = 0; i < newStudents.size(); i++) {
                                            System.out.println(newStudents.get(i).outputInformention());
                                        }
                                        newStudents.clear();
                                        tryCatch.pressKeyToContinue();
                                    } else {
                                        System.out.println("Doesn't Have student Name:" + searchName + " Here...!");
                                    }
                                } else {
                                    System.out.println("Doesn't Have student Here...!");
                                }
                                break;
                            case 3:
                                    if (student.size() > 0) {
                                        System.out.println("3.Search By Gender");
                                        String searchGender = tryCatch.tryCatchInputOnlyLetters("Gender");
                                        System.out.println("\t\t\t\t\t\t=============================");
                                        System.out.println("\t\t\t\t\t\t|\t   student informention   |");
                                        System.out.println("\t\t\t\t\t\t=============================");
                                        for (int i = 0; i < student.size(); i++) {
                                            if (student.get(i).getGender().equalsIgnoreCase(searchGender)) {
                                                newStudents.add(student.get(i));
                                            }
                                        }
                                        if (newStudents.size() > 0) {
                                            for (int i = 0; i < newStudents.size(); i++) {
                                                System.out.println(newStudents.get(i).outputInformention());
                                            }
                                            newStudents.clear();
                                            tryCatch.pressKeyToContinue();
                                        } else {
                                            System.out.println("Doesn't Have student Gender:" + searchGender + " Here...!");
                                        }
                                    } else {
                                        System.out.println("Doesn't Have student Here...!");
                                    }
                                break;
                            case 4:
                                if (student.size() > 0) {
                                System.out.println("4.Search By Class name");
                                String searchClassName = tryCatch.tryCatchInputOnlyLetters("Class Name");
                                System.out.println("\t\t\t\t\t\t=============================");
                                System.out.println("\t\t\t\t\t\t|\t   student informention   |");
                                System.out.println("\t\t\t\t\t\t=============================");
                                for (int i = 0; i < student.size(); i++) {
                                    if (student.get(i).getClassName().equalsIgnoreCase(searchClassName)) {
                                        newStudents.add(student.get(i));
                                    }
                                }
                                if (newStudents.size() > 0) {
                                    for (int i = 0; i < newStudents.size(); i++) {
                                        System.out.println(newStudents.get(i).outputInformention());
                                    }
                                    newStudents.clear();
                                    tryCatch.pressKeyToContinue();
                                } else {
                                    System.out.println("Doesn't Have student Class Name:" + searchClassName + " Here...!");
                                }
                        } else {
                            System.out.println("Doesn't Have student Here...!");
                        }
                                break;
                            case 5:
                                System.out.println("Exit....");
                                break;
                        }
                    }while (tryCatch.getOption()!= tryCatch.options);
                    tryCatch.setOptions(0);
                    break;
                case 5:
                    System.out.println("5. Show Student information ");
                    for(int i=0 ; i<student.size() ;i++){
                        System.out.println(student.get(i).outputInformention());
                    }
                    tryCatch.pressKeyToContinue();
                    break;
                case 6:
                    System.out.println("6. Exit");
                    break;
            }
        }while (tryCatch.option!= tryCatch.options);
     }
 }