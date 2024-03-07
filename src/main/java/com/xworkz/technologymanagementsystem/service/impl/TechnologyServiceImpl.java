package com.xworkz.technologymanagementsystem.service.impl;

import com.xworkz.technologymanagementsystem.dto.TechnologyDTO;
import com.xworkz.technologymanagementsystem.repository.TechnologyRepository;
import com.xworkz.technologymanagementsystem.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    private TechnologyRepository repository;
    public boolean validateAndSave(TechnologyDTO dto) {
        if(dto!=null){
            repository.save(dto);
            return true;
        }
        return false;
    }

    public List<TechnologyDTO> validateGetAllTechnologies() {
        return repository.getAllTechnologies();
    }
}
