package br.edu.ifmg.escola.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_course")
public class Course {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();

}
