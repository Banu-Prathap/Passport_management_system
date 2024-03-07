package com.xworkz.technologymanagementsystem.repository;

import com.xworkz.technologymanagementsystem.dto.TechnologyDTO;

import java.util.List;

public interface TechnologyRepository {
   public boolean save(TechnologyDTO dto);

   List<TechnologyDTO> getAllTechnologies();
}
