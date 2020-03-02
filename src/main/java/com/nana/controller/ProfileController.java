package com.nana.controller;

import com.nana.dto.ProfileDTO;
import com.nana.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ProfileController {
    @Autowired
    public ProfileService service;

    @RequestMapping("/home.htm")
    public String showHome(){
        return "welcome";
    }
    @RequestMapping("/listProfiles.htm")
    public String getAllProfiles(Map<String,Object> map){
        List<ProfileDTO> dtoList=null;
        dtoList=service.fetchAllProfiles();
        map.put("listProfiles",dtoList);
        return "listProfile";
    }
}
