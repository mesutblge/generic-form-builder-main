package com.sirius.generic.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@Table(name = "propertiesForms")
public class PropertiesForms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String key;
    private String value;

    public PropertiesForms(Long id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }
}
