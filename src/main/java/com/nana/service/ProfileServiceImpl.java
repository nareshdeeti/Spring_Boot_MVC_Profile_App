package com.nana.service;

import com.nana.bo.ProfileBO;
import com.nana.dao.ProfileDAO;
import com.nana.dto.ProfileDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileDAO profileDAO;

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public List<ProfileDTO> fetchAllProfiles() {
        List<ProfileBO> boList=null;
        final  List<ProfileDTO> dtoList=new ArrayList<>();
        boList = profileDAO.getAllProfiles();
        boList.forEach(bo->{
            ProfileDTO profileDTO=null;
            profileDTO = new ProfileDTO();
            BeanUtils.copyProperties(bo,profileDTO);
            dtoList.add(profileDTO);
        });
            return dtoList;
        }
}
