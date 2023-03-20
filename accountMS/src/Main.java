import java.util.*;

public class Main {
        public static void main(String[] args) {
            int option,showOption;
            List<Account> accountList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("1: Add account:");
                System.out.println("2: Remove Account: ");
                System.out.println("3. Edit Account ");
                System.out.println("4. Show account infor");
                System.out.println("5. Exit ");
                System.out.println("Choose option ( 1 - 5 ) : ");
                option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter your account infor");
                        Account acc = new Account();
                        System.out.print("Input ID:");
                        int id= input.nextInt();
                        acc.setId(id);
                        System.out.print("Name:");
                        input.nextLine();
                        String name = input.nextLine();
                        acc.setName(name);
                        System.out.print("Balance:");
                        double balance=input.nextInt();
                        acc.setBalance(balance);
                        accountList.add(acc);
                        System.out.println("Account added successfully.");
                        break;
                    case 2:
                        System.out.print("Input ID:");
                        int did= input.nextInt();
                        boolean isRemoved = accountList.removeIf(account -> account.getId() == did);
                        if (isRemoved) {
                            System.out.println("Account deleted successfully.");
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;
                    case 3:
                        System.out.println("Edit your account infor");
                        System.out.print("Input ID:");
                        int eid= input.nextInt();
                        Optional<Account> accountOptional = accountList.stream().filter(account -> account.getId() == eid).findFirst();
                        if (accountOptional.isPresent()) {
                            System.out.print("New Name:");
                            input.nextLine();
                            String ename = input.nextLine();
                            System.out.print("New Balance:");
                            double ebalance=input.nextInt();
                            Account account = accountOptional.get();
                            account.setName(ename);
                            account.setBalance(ebalance);
                            System.out.println("Account updated successfully.");
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;
                    case 4:
                        do {

                        System.out.println("Show account nformation");
                        System.out.println("1. Ascending order (by ID )");
                        System.out.println("2. Descending order (by ID) ");
                        System.out.println("3. Descendig order by balance ");
                        System.out.println("4. Exit ");

                        System.out.println("Choose show option : ");
                        showOption = input.nextInt();
                        switch (showOption) {
                            case 1:
                                List<Account> accountAscending = new ArrayList<>(accountList);
                                accountAscending.sort(Comparator.comparingInt(Account::getId));
                                for (Account account : accountAscending) {
                                    System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
                                }
                                break;
                            case 2:
                                List<Account> accountDescending = new ArrayList<>(accountList);
                                accountDescending.sort(Comparator.comparingInt(Account::getId).reversed());
                                for (Account account : accountDescending) {
                                    System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
                                }
                                break;
                            case 3:
                                List<Account> accountShortByBalance = new ArrayList<>(accountList);
                                accountShortByBalance.sort(Comparator.comparingDouble(Account::getBalance).reversed());
                                for (Account account : accountShortByBalance) {
                                    System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
                                }
                                break;
                            case 4:
                                System.out.println("Exit the Show....!");
                                break;

                          }
                        } while (showOption != 4);
                    case 5:
                        System.out.println("Exit the program....!");
                        break;
                }
            } while (option != 5);
        }
    }