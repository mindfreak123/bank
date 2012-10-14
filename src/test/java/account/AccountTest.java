package account;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAccount() {
		Account account = new Account("Tomas");
		assertEquals("Tomas", account.getName());
	}

	@Test
	public void testGetName() {
		Assert.assertTrue(true);
	}

}
