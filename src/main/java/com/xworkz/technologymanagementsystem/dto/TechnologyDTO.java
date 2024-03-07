package com.xworkz.technologymanagementsystem.dto;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Data
@Table(name = "technologies")
@NamedQueries(
        {
                @NamedQuery(name = "getAllTech", query = "from TechnologyDTO dto")
        }
)
public class TechnologyDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tech_id")
    private int id;
//    @NotNull
//    @Size(min = 3, max = 10, message = "Name should be in between 3-10 characters")
    @Column(name = "technology_name")
    private String technologyName;
    @Column(name = "version")
    private String version;
    @Column(name = "release_year")
    private String releaseYear;
}
