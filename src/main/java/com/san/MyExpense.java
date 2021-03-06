package com.san;

import org.apache.log4j.Logger;

/**
 * @author Sangram Konde
 *
 * MyExpense class - This is simple class created
 * to test junit with maven
 */
public class MyExpense {

    static final Logger logger = Logger.getLogger(MyExpense.class);
    private Double expense = null;

    /**
     * This is just simple method to get an expense of a user
     *
     * @param userId
     * @param expenseType
     * @throws IllegalArgumentException Thrown when user is not valid.
     */
    public Double getExpense(String userId, String expenseType) {

        logger.info("Getting expenses....");
        if (null != userId && !userId.isEmpty()) {

            expenseType = (null == expenseType || expenseType.isEmpty()) ? "Monthly" : expenseType;

            logger.info("Calculating '" + expenseType + "' expense for user '"+ userId+"'");
            if (null != expenseType || !expenseType.isEmpty()) {
                if (expenseType.equalsIgnoreCase("Yearly")) {

                    expense = 25000.0;

                } else if (expenseType.equalsIgnoreCase("Monthly")) {

                    expense = 2500.50;

                } else if (expenseType.equalsIgnoreCase("Daily")) {

                    expense = 80.0;
                }
            }
            logger.info(expenseType + "' expenses for user '"+userId+"' is : " + expense);
            logger.info("======================================================");
        } else {
            throw new IllegalArgumentException(String.format(
                    "Parameter << userId >> is not valid"
            ));
        }
        return expense;
    }


    /**
     * Add expenses.
     *
     * @param userId
     * @param expenseType
     * @param expenseAmount
     */
    public void addExpense(String userId, String expenseType, Double expenseAmount) {

        // TODO : provide actual implementation
        logger.info("Adding expenses...");
        if (null != userId && !userId.isEmpty()) {

            if(null != expenseType && !expenseType.isEmpty()){
                logger.info("Your '" + expenseType + "' expenses for amount '" + expenseAmount + "' has been added.");
                logger.info("======================================================");
            }else{
                throw new IllegalArgumentException(String.format(
                        "Parameter << expenseType >> is not valid"
                ));
            }
        } else {
            throw new IllegalArgumentException(String.format(
                    "Parameter << userId >> is not valid"
            ));
        }
    }
}

