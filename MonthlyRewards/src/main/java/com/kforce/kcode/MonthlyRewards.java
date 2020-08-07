package com.kforce.kcode;

import com.kforce.kcode.domain.CustomerTrans;
import com.kforce.kcode.domain.CustomerTransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;

/**
 *
 * @author Bill Woods
 * @date 07-26-20
 *
 * This application is written for the Portals Platform team in Maryland Heights, MO,
 * as a homework assignment of sample code using Java, Spring Boot, REST
 * and various other relevant technologies as determined to express
 * skill in being able to write and present such working code.
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
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * USAGE: navigate using your browser, Postman or curl to http://localhost:8080/monthlyrewards
 * in order to use this REST service and see the data once this application has been started
 * To see all data, http://localhost:8080/transactions
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 *
 */
@SpringBootApplication
public class MonthlyRewards {

	@Autowired
	private CustomerTransRepository repository;

	public static void main(String[] args) {
		SpringApplication.run( MonthlyRewards.class, args);
	}

	/**
	 *
	 * In practice customer transaction data would be loaded from an external datasource, i.e.
	 * files, UI entries etc.
	 * For simplicity we will load this via Springboots command line runner.
	 *
	 * @return
	 */
	@Bean
	CommandLineRunner runner() {

		return args -> {
			//Add and save sample data here. This should be converted to file loading or something else in testing and prod.
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
							"Bill", "S", "Woods", Timestamp.valueOf("2020-04-01 21:30:55.888"), 300.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
							"Bill", "S", "Woods", Timestamp.valueOf("2020-06-03 00:00:00.000"), 150.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
							"Bill", "S", "Woods", Timestamp.valueOf("2020-06-15 00:00:00.000"), 300.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
							"Bill", "S", "Woods", Timestamp.valueOf("2020-07-15 00:00:00.000"), 250.00
					)
			);
			//------------------------------------------------------------------------------------------------------------------
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
							"Darth", "T", "Vader", Timestamp.valueOf("2020-05-15 00:00:00.000"), 50.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
					"Darth", "T", "Vader", Timestamp.valueOf("2020-06-15 00:00:00.000"), 100.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
					"Darth", "T", "Vader", Timestamp.valueOf("2020-07-15 00:00:00.000"), 1000.00
					)
			);
			//------------------------------------------------------------------------------------------------------------------
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
							"Luke", "", "Skywalker", Timestamp.valueOf("2020-05-15 00:00:00.000"), 10.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
					"Luke", "", "Skywalker", Timestamp.valueOf("2020-06-15 00:00:00.000"), 1200.00
					)
			);
			repository.save(new CustomerTrans(
							// public CustomerTrans ( String firstName, String midInitial, String lastName,
							//	Date transactionDate, double transactionAmount) {
					"Luke", "", "Skywalker", Timestamp.valueOf("2020-07-15 00:00:00.000"), 50000.00
					)
			);
			//------------------------------------------------------------------------------------------------------------------

		};

	}

}
