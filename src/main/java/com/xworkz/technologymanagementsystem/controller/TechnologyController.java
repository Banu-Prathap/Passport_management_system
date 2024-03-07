package com.xworkz.technologymanagementsystem.controller;

import com.xworkz.technologymanagementsystem.dto.TechnologyDTO;
import com.xworkz.technologymanagementsystem.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class TechnologyController {
    @Autowired
    private TechnologyService service;
    @PostMapping("technology")
    public String onSubmit(@ModelAttribute TechnologyDTO dto, Model model){
    String name = dto.getTechnologyName();
    if(service.validateAndSave(dto)){
        model.addAttribute("techName", name);
        return "response";
    }
    return "error";
    }

    @GetMapping("getAllTechnologies")
    public String getAllTechnologies(Model model){
        List<TechnologyDTO> list = service.validateGetAllTechnologies();
        model.addAttribute("add", list);
        System.out.println(list);
        return "getTechnologies";
    }

}
