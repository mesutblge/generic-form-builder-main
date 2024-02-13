package com.sirius.generic.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
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
@Table(name = "FormScreenElement")
public class FormScreenElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String label;
    private String placeholder;
    private boolean required;
    @ElementCollection
    private List<String> options;

    @ManyToOne
    @JoinColumn(name = "formScreen_id")
    private FormScreen formScreen;

    public FormScreenElement(Long id, String type, String label, String placeholder, boolean required, List<String> options, FormScreen formScreen) {
        this.id = id;
        this.type = type;
        this.label = label;
        this.placeholder = placeholder;
        this.required = required;
        this.options = options;
        this.formScreen = formScreen;
    }
}
