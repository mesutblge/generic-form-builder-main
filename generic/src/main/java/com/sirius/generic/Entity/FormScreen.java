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
@Table(name = "formScreen")
public class FormScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private int screenOrder;

    @ManyToOne
    @JoinColumn(name = "form_id")
    private Form form;

    @OneToMany(mappedBy = "formScreen")
    private List<FormScreenElement> screenElements;

    public FormScreen(Long id, String title, String description, int screenOrder, Form form, List<FormScreenElement> screenElements) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.screenOrder = screenOrder;
        this.form = form;
        this.screenElements = screenElements;
    }

  /*   @OneToMany(mappedBy = "formScreen")
    private List<FormScreenElement> screenElements;

    public FormScreen(Long id, String title, String description, int order, Form form, List<FormScreenElement> screenElements) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.order = order;
        this.form = form;
        this.screenElements = screenElements;
    }*/


}
