# KCode

/**
 *
 * @author Bill Woods
 * @date 07-26-20
 *
 *
 * A record of every transaction for a customer is provided for a three month period.
 * This module will then calculate the reward points earned and their totals for
 * each customer during that 3 month period.
 *
 * Note: In this demo we are using the H2 in memory database. Once this Spring application
 * has been started you may access the console @ http://localhost:8080/h2-conole .
 * Just press the "Connect" Button then more data may be entered directly or viewed.
 *
 * Warning: Since this is using an in memory database once the application is stopped
 * all data will be removed and only the data inserted from the command line runner
 * will be inserted upon restart.
 *
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * USAGE: navigate using your browser, Postman or curl to http://localhost:8080/monthlyrewards
 * in order to use this REST service and see the data once this application has been started
 * To see all data, http://localhost:8080/transactions
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 *
 */

 //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 //Fetch Customer Rewards partition by year and month according to the following rules
 //A customer receives 2 points for every dollar spent over $100 in each transaction,
 // plus 1 point for every dollar spent over $50 in each transaction
 //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    
    
