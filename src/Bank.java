import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Bank {

    static BufferedReader br;
    static String trans = "";
    public static void main(String[] args) {

        transaction();

    }
    static void otherTrans(){
        try{

            System.out.println("Do you want another transaction Y/N");
            trans = br.readLine().toUpperCase();
        }catch (Exception e){
            System.out.println(e);
        }


    }

    static void transaction(){
        try {
            SavingAccount savingAccount = new SavingAccount();
            InputStreamReader is = new InputStreamReader(System.in);
            br = new BufferedReader(is);
            System.out.println("Select Account Type by pressing #\n 1.Saving\t2.Current Account");
            String accountType = br.readLine();

            if(accountType.equals("1")){

                do{
                    System.out.println("Select Transaction by pressing #: ");
                    System.out.println("1:Balance Inquiry\t2:Deposit\n3:Withdraw\t\t\t4:Cancel");
                    int select = Integer.parseInt(br.readLine());

                    switch (select){
                        case 1:
                            System.out.println("Your Current Balance is: "+savingAccount.balanceInquiry());
                            otherTrans();
                            break;
                        case 2:

                            System.out.print("Enter Amount: ");
                            double amount =  Double.parseDouble(br.readLine());
                            savingAccount.deposit(amount);
                            System.out.println("You Deposit: "+ amount);
                            System.out.println("Your new balance is: "+ savingAccount.balanceInquiry());
                            otherTrans();
                            break;
                        case 3:
                            System.out.println("Enter amount: ");
                            double withdrawAmount = Double.parseDouble(br.readLine());
                            if(withdrawAmount > savingAccount.balanceInquiry()){
                                System.out.println("Insufficient Balance");
                                otherTrans();
                            }
                            else{
                                savingAccount.withdraw(withdrawAmount);
                                System.out.println("You withdraw: "+ withdrawAmount);
                                System.out.println("Your new balance is: "+ savingAccount.balanceInquiry());
                                otherTrans();
                                break;
                            }
                        case 4:
                            savingAccount.exit();
                            break;
                        default:
                            break;
                    }
                }while(!trans.equals("N"));
            }
            else if(accountType.equals("2")){
                do{
                    System.out.println("Select Transaction by pressing #: ");
                    System.out.println("1:Balance Inquiry\t2:Deposit\n3:Withdraw\t\t\t4:Cancel");
                    int select = Integer.parseInt(br.readLine());

                    switch (select){
                        case 1:
                            System.out.println("Your Current Balance is: "+savingAccount.balanceInquiry());
                            otherTrans();
                            break;
                        case 2:

                            System.out.print("Enter Amount: ");
                            double amount =  Double.parseDouble(br.readLine());
                            savingAccount.deposit(amount);
                            System.out.println("You Deposit: "+ amount);
                            System.out.println("Your new balance is: "+ savingAccount.balanceInquiry());
                            otherTrans();
                            break;
                        case 3:
                            System.out.println("Enter amount: ");
                            double withdrawAmount = Double.parseDouble(br.readLine());
                            if(withdrawAmount > savingAccount.balanceInquiry()){
                                System.out.println("Insufficient Balance");
                                otherTrans();
                            }
                            else{
                                savingAccount.withdraw(withdrawAmount);
                                System.out.println("You withdraw: "+ withdrawAmount);
                                System.out.println("Your new balance is: "+ savingAccount.balanceInquiry());
                                otherTrans();
                                break;
                            }
                        case 4:
                            savingAccount.exit();
                            break;
                        default:
                            break;
                    }
                }while(!trans.equals("N"));
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
