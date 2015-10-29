package pt.ist.syllabus;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Syllabus {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private String name;

    @OneToMany
    private Set<Topic> topics;

    public Syllabus() {
        topics = new HashSet<Topic>();
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

    public Set<Topic> getTopics() {
        return topics;
    }
}
