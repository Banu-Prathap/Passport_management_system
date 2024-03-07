package com.xworkz.technologymanagementsystem.repository.impl;

import com.xworkz.technologymanagementsystem.dto.TechnologyDTO;
import com.xworkz.technologymanagementsystem.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class TechnologyRepositoryImpl implements TechnologyRepository {
    @Autowired
   private EntityManagerFactory entityManagerFactory;
    public boolean save(TechnologyDTO dto) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        return true;
    }

    public List<TechnologyDTO> getAllTechnologies() {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        List<TechnologyDTO> list =manager.createNamedQuery("getAllTech").getResultList();
        return list;
    }


}
