package br.edu.ifmg.escola.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_role")
public class Role {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String authority;

}