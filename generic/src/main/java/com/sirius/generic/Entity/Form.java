package com.sirius.generic.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.jackson.JsonComponent;

import java.sql.Date;
@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@Table(name = "form")
@JsonComponent
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Date createdAt;

    public Form(Long id, String title, String description, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
    }
}
