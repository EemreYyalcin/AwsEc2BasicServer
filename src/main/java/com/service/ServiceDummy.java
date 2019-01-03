package com.service;

import com.data.Dummy;
import com.repository.RepoDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDummy {

    @Autowired
    private RepoDummy repoDummy;


    public Dummy saveDummy(Dummy dummy){
        return repoDummy.save(dummy);
    }



}
