package com.aere.spring.all.DAO.manager;


import com.aere.spring.all.DAO.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;

@Transactional
@Repository
public interface PhoneRepository extends CrudRepository<Phone,Long> {


    Page<Phone> findAll(Pageable pageable);

    Phone findByNameAllIgnoringCase(String name);

//    @Query("SELECT * FROM phone WHERE")
//    Phone findByLatestReleaseDate();
}
