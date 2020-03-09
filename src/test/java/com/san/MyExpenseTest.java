package com.san;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Sangram Konde
 */
public class MyExpenseTest {

    @Test
    public void testAddExpense() {

        MyExpense myExpense = new MyExpense();
    }

    @Test
    public void testGetExpenseDaily(){
        MyExpense myExpense = new MyExpense();
        assertThat(myExpense.getExpense("101", "Daily"), is(equalTo(80.0)));
    }

    @Test
    public void testGetExpenseMonthly(){
        MyExpense myExpense = new MyExpense();
        assertThat(myExpense.getExpense("101", "Monthly"), is(equalTo(2500.50)));
    }

    @Test
    public void testGetExpenseYearly(){
        MyExpense myExpense = new MyExpense();
        assertThat(myExpense.getExpense("101", "Yearly"), is(equalTo(25000.0)));
    }

    @Test
    public void testIllegalArgumentForUserNotValidForGetExpense() {
        MyExpense myExpense = new MyExpense();
        assertThrows(IllegalArgumentException.class, () -> myExpense.getExpense(null, "Daily"));
    }

    @Test
    public void testIllegalArgumentForUserNotValid() {
        MyExpense myExpense = new MyExpense();
        assertThrows(IllegalArgumentException.class, () -> myExpense.addExpense(null, "Daily", 60.0));
    }

    @Test
    public void testIllegalArgumentForExpenseTypeNotValid() {
        MyExpense myExpense = new MyExpense();
        assertThrows(IllegalArgumentException.class, () -> myExpense.addExpense("101", "", 60.0));
    }
}
