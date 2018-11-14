package pl.blenart.creditcard;

import org.junit.Assert;

import org.junit.Test;


public class CreditCardTest {
    
    @Test
    public void assignCreditLimitToCard() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        
        Assert.assertTrue(card.getLimit() == 2000);
    }
    
    @Test
    public void cantWithdrawWhenCantAfford() {
        
    }
    
    @Test
    public void canBlockCredsitCard() {
        CreditCard card = new CreditCard();
        card.block();
        Assert.assertTrue(card.isBlocked());
    }
    @Test
    public void withdrawDecreaseAvailableFunds() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        card.withdraw(1000);
        
        Assert.assertTrue(card.getBalance() == 1000);
    }
    
    @Test
    public void repayCredit() {
        CreditCard card = new CreditCard();
        card.assignLimit(1000);
        card.withdraw(500);
        card.withdraw(200);
        card.repay(400);
        Assert.assertTrue(card.getBalance() == 700);
    }
}
