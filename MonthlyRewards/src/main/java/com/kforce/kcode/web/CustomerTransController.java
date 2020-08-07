package com.kforce.kcode.web;

import com.kforce.kcode.domain.CustomerTrans;
import com.kforce.kcode.domain.CustomerTransRepository;
import com.kforce.kcode.domain.MonthlyReward;
import com.kforce.kcode.domain.MonthlyRewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerTransController {
    @Autowired
    private CustomerTransRepository customerTransRepository;

    @Autowired
    private MonthlyRewardsRepository monthlyRewardsRepository;

    @RequestMapping("/transactions")
    public Iterable<CustomerTrans> getCustomerTrans() {
        return customerTransRepository.findAll();
    }


    @RequestMapping("/monthlyrewards")
    public Iterable<MonthlyReward> getMonthlyRewards() {
        return monthlyRewardsRepository.findAllMonthly();
    }

}
