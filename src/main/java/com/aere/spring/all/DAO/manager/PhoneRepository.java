package com.aere.spring.all.DAO.manager;


import com.aere.spring.all.DAO.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long> {


    Page<Phone> findAll(Pageable pageable);

//    Phone findByNameAllIgnoringCase(String name);

//    @Query("SELECT * FROM phone WHERE")
//    Phone findByLatestReleaseDate();
}
