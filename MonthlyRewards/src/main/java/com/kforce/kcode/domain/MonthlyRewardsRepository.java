package com.kforce.kcode.domain;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MonthlyRewardsRepository extends CrudRepository<MonthlyReward, Long> {

    //Fetch Customer Rewards partition by year and month according to the following rules
    //A customer receives 2 points for every dollar spent over $100 in each transaction,
    // plus 1 point for every dollar spent over $50 in each transaction
    //
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    //Note: The Substring() function in the query is specific to H2. If You may have
    // to use a different named or signature for substring in another database
    //This dependency can be removed in a future iteration.
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    @Query(value =
    " SELECT Max(ID) ID, first_name||' '||Mid_initial||' '||last_name NAME, "+
    " case when sum(2*(TRANSACTION_AMOUNT  - 100)) > 0 then  sum(2*(TRANSACTION_AMOUNT  - 100))  ELSE 0 end + "+
    " case when sum(TRANSACTION_AMOUNT  - 50)  > 0 then sum(TRANSACTION_AMOUNT  - 50)  ELSE 0 end Points, "+
    " substring(transaction_date,1,7) Date "+
    " FROM CUSTOMER_TRANS  group by first_name||Mid_initial||last_name,substring(transaction_date,1,7)", nativeQuery = true)
    List<MonthlyReward> findAllMonthly();

}
