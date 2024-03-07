package com.xworkz.technologymanagementsystem.service;

import com.xworkz.technologymanagementsystem.dto.TechnologyDTO;

import java.util.List;

public interface TechnologyService {
    public boolean validateAndSave(TechnologyDTO dto);

    List<TechnologyDTO> validateGetAllTechnologies();
}

