package com.aere.spring.all.DAO.manager;

import javax.annotation.Resource;

/**
 * Created by epxpxpx on 4/7/2016.
 */
public class ComplexPhoneQueriesImpl implements ComplexPhoneQueries {
    @Resource
    private PhoneRepository phoneRepository;
}
