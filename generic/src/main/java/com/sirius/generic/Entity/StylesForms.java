package com.sirius.generic.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@Table(name = "stylesForms")
public class StylesForms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cssName;
    private String cssValue;
    @ManyToOne
    @JoinColumn(name = "PropertiesForms_id")
    private PropertiesForms property;
    @ManyToOne
    @JoinColumn(name = "FormScreenElement_id")
    private FormScreenElement formElement;

    public StylesForms(Long id, String cssName, String cssValue, PropertiesForms property, FormScreenElement formElement) {
        this.id = id;
        this.cssName = cssName;
        this.cssValue = cssValue;
        this.property = property;
        this.formElement = formElement;
    }
}
