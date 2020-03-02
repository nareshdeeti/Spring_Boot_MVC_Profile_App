package com.nana.dao;


import com.nana.bo.ProfileBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("profileDAAO")
public class ProfileDaoImpl implements ProfileDAO {
private static final String QUERY_PROFILE="SELECT PROFILEID,PROFILENAME,EMAIL,FOLLOWERS,FRIENDS FROM PROFILE";

@Autowired
private JdbcTemplate jdbcTemplate;
    @Override
    public List<ProfileBO> getAllProfiles() {
        List<ProfileBO> boList = null;
        boList=jdbcTemplate.query(QUERY_PROFILE,rs->{
            List<ProfileBO> listBO=null;
            ProfileBO profileBO=null;
            listBO=new ArrayList<>();
            while (rs.next()){
                profileBO=new ProfileBO();
                profileBO.setProfileId(rs.getInt(1));
                profileBO.setProfileName(rs.getString(2));
                profileBO.setEmail(rs.getString(3));
                profileBO.setFollpwers(rs.getInt(4));
                profileBO.setFriends(rs.getInt(5));
                listBO.add(profileBO);

            }
            return listBO;
        });
        return boList;
    }
}
