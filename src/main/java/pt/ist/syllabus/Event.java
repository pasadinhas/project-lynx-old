package pt.ist.syllabus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private String name;


    public Event() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

}
