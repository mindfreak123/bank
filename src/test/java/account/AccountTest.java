package account;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Account account;
	
	@Test
    public void testSlow() {
	  account = new Account("tomas");	
      assertEquals("tomas", account.getName());
    }
	
}
