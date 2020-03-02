package com.nana.bo;

import lombok.Data;

@Data
public class ProfileBO {
    private int profileId;
    private String profileName;
    private String email;
    private int follpwers;
    private int friends;

    public ProfileBO() {
    }
}
