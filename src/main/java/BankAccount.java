
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
    public BankAccount(String firstName, String lastName, String dateOfBirth, Integer accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.accountNumber = accountNumber;
        this.balance = 0.00;
    }

    //Write getter for first name.
    public String getFirstName(){
        return this.firstName;
    }

    // Write setter for first name.
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //TODO:+ getLastName(): String
    // Write getter for last name
    public String getLastName(){
        return this.lastName;
    }


    //TODO:+ setLastName(String): void
    // Write setter for last name.

    //TODO:+ getDateOfBirth(): LocalDate
    // Write getter for date of birth.
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    //TODO:+ setDateOfBirth(LocalDate): void
    // Write setter for date of birth.

    //TODO:+ getAccountNumber(): Integer
    // Write getter for account number.
    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    //TODO:+ setAccountNumber(Integer): void
    // Write setter for account number.

    //TODO:+ getBalance(): Double
    // Write getter for balance.
    public Double getBalance(){
        return this.balance;
    }

    //TODO:+ deposit(Double): void
    // Write deposit method to add amount and update balance.

    //TODO:+ withdrawal(Double): void
    // Write withdrawal method to take out an amount and update balance.

    //TODO:+ payInterest(Double): void
    // Write payInterest method to pay interest on the balance.
}
