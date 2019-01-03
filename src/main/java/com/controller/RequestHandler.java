package com.controller;


import com.data.Dummy;
import com.service.ServiceDummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class RequestHandler {

    @Autowired
    ServiceDummy serviceDummy;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String addElement(@RequestBody Dummy dummy){
        dummy = serviceDummy.saveDummy(dummy);
        return "Saved Successfully  " + dummy.getId();
    }

}
