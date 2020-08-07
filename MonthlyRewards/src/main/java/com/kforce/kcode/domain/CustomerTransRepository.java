package com.kforce.kcode.domain;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerTransRepository extends CrudRepository<CustomerTrans, Long> {
    //Fetch Customer transaction by Id
    @Query("select c from CustomerTrans c where c.id =?1 ")
    List<CustomerTrans> findById(long id);

    //Fetch Customer transaction by Id
    @Query("select c from CustomerTrans c")
    List<CustomerTrans> findAll();


}
