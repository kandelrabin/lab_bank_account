import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    // arrange step-1
    public BankAccount bankaccount;

    // arrange step-2
    @BeforeEach
    public void setUp(){
        bankaccount = new BankAccount("Conor", "McGregor", "14-07-1988", 12345678);
    }

    @Test
    public void canGetFirstName(){
        // act
        String result = bankaccount.getFirstName();
        // assert
        String expected = "Conor";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName(){
        bankaccount.setFirstName("Conchúr");
        String result = bankaccount.getFirstName();
        String expected = "Conchúr";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetLastName(){
        String result = bankaccount.getLastName();
        String expected = "McGregor";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        bankaccount.setLastName("Gréagóir");
        String result = bankaccount.getLastName();
        String expected = "Gréagóir";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth(){
        LocalDate result = bankaccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1988, 07, 14);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        bankaccount.setDateOfBirth("14-07-1989");
        LocalDate result = bankaccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1989, 07, 14);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber(){
        Integer result = bankaccount.getAccountNumber();
        Integer expected = 12345678;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        bankaccount.setAccountNumber(87654321);
        Integer result = bankaccount.getAccountNumber();
        Integer expected = 87654321;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetBalance(){
        Double result = bankaccount.getBalance();
        Double expected = 0.00;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canDeposit(){
        bankaccount.deposit(1000.00);
        Double result = bankaccount.getBalance();
        Double expected = 1000.00;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canWithdraw(){
        bankaccount.deposit(1000.00);
        bankaccount.withdrawal(600.00);
        Double result = bankaccount.getBalance();
        Double expected = 400.00;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canPayInterest(){
        bankaccount.deposit(1000.00);
        bankaccount.payInterest();
        Double result = bankaccount.getBalance();
        Double expected = 1010.00;
        assertThat(result).isEqualTo(expected);
    }


}
