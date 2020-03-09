package com.san;

/**
 * @author Sangram Konde
 *
 * MyExpense class - This is simple class created
 * to test junit with maven
 */
public class MyExpense {

    private Double expense = null;

    /**
     * This is just simple method to get an expense of a user
     *
     * @param userId
     * @param expenseType
     * @throws IllegalArgumentException Thrown when user is not valid.
     */
    public Double getExpense(String userId, String expenseType) {

        System.out.println("Getting expenses....");
        if (null != userId && !userId.isEmpty()) {

            expenseType = (null == expenseType || expenseType.isEmpty()) ? "Monthly" : expenseType;

            System.out.println("Calculating '" + expenseType + "' expense for user '"+ userId+"'");
            if (null != expenseType || !expenseType.isEmpty()) {
                if (expenseType.equalsIgnoreCase("Yearly")) {

                    expense = 25000.0;

                } else if (expenseType.equalsIgnoreCase("Monthly")) {

                    expense = 2500.50;

                } else if (expenseType.equalsIgnoreCase("Daily")) {

                    expense = 80.0;
                }
            }
            System.out.println(expenseType + "' expenses for user '"+userId+"' is : " + expense);
            System.out.println("======================================================");
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
        System.out.println("Adding expenses...");
        if (null != userId && !userId.isEmpty()) {

            if(null != expenseType && !expenseType.isEmpty()){
                System.out.println("Your '" + expenseType + "' expenses for amount '" + expenseAmount + "' has been added.");
                System.out.println("======================================================");
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

