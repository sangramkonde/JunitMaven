package com.san;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Sangram Konde
 */
@ExtendWith(MockitoExtension.class)
public class ExpenseAppTest {

    @BeforeAll
    public static void setup() {
        // TODO :
    }

    @AfterAll
    public static void tearDown() {
        // TODO :
    }

    @Test
    public void testMain() {
        String[] args = {"1"};
        ExpenseApp.main(args);
    }
}
