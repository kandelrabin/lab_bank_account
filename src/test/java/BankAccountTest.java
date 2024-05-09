import org.assertj.core.internal.bytebuddy.asm.Advice;
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
        bankaccount.setFirstName("Notorious");
        String result = bankaccount.getFirstName();
        String expected = "Notorious";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetLastName(){
        String result = bankaccount.getLastName();
        String expected = "McGregor";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth(){
        LocalDate result = bankaccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1988, 07, 14);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber(){
        Integer result = bankaccount.getAccountNumber();
        Integer expected = 12345678;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canGetBalance(){
        Double result = bankaccount.getBalance();
        Double expected = 0.0;
        assertThat(result).isEqualTo(expected);
    }


}
