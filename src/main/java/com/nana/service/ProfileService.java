package com.nana.service;

import com.nana.dto.ProfileDTO;

import java.util.List;

public interface ProfileService {
    public List<ProfileDTO> fetchAllProfiles();
}
