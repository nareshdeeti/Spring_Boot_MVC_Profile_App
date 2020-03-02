package com.nana.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class ProfileDTO implements Serializable {
    private int profileId;
    private String profileName;
    private String email;
    private int followers;
    private int friends;
}
