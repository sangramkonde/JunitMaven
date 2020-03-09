package com.san;

import org.apache.log4j.BasicConfigurator;

/**
 * @author Sangram Konde
 *
 */
public class ExpenseApp {

    public static void main(String[] args) {

        BasicConfigurator.configure();

        MyExpense myExpense = new MyExpense();

        myExpense.addExpense("101", "Daily", 50.0);

        myExpense.getExpense("101", "Monthly");

    }
}
