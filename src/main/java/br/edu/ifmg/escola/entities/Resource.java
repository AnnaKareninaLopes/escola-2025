package br.edu.ifmg.escola.entities;

import br.edu.ifmg.escola.constants.ResourceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_resource")
public class Resource {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;

    @Enumerated(EnumType.STRING)//ORDINAL
    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
}
