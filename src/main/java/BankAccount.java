import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class BankAccount {

    // Declare attributes/ properties of a Bank Account.
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer accountNumber;
    private Double balance;
    private String accountType;
    private Double overdraft;

    // Define a constructor.
    public BankAccount(String firstName, String lastName, String dateOfBirth, Integer accountNumber, String accountType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.accountNumber = accountNumber;
        this.balance = 0.00;
        this.accountType = accountType;
        this.overdraft = 10.00;
    }

    //Write getter for first name.
    public String getFirstName(){
        return this.firstName;
    }

    // Write setter for first name.
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // Write getter for last name
    public String getLastName(){
        return this.lastName;
    }

    // Write setter for last name.
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Write getter for date of birth.
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    // Write setter for date of birth.
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // Write getter for account number.
    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    // Write setter for account number.
    public void setAccountNumber(Integer accountNumber){
        this.accountNumber = accountNumber;
    }

    // Write getter for balance.
    public Double getBalance(){
        return this.balance;
    }

    // Write deposit method to add amount and update balance.
    public void deposit(Double amount){
        this.balance += amount;
    }

    // Write withdrawal method to take out an amount and update balance.
    public void withdrawal(Double amount){
        if (this.balance-amount >= this.overdraft){
            this.balance -= amount;
        }
    }

    // Write payInterest method to pay interest on the balance.
    public void payInterest(){
        Double savingInterestRate = (double) 5/100;
        Double currentInterestRate = (double) 1/100;
        switch (this.accountType.toLowerCase()){
            case "savings":
                this.balance = this.balance*savingInterestRate + this.balance;
                break;
            case "current":
                this.balance = this.balance*currentInterestRate + this.balance;
                break;
        }
    }



}
