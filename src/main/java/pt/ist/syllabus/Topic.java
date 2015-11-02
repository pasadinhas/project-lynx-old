package pt.ist.syllabus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.annotate.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private String name;

    //@ManyToOne(fetch = FetchType.LAZY)
    //private Syllabus syllabus;

    @OneToMany
    private Set<Topic> subtopics;

    @OneToMany
    private Set<Event> events;


    //@ManyToOne
    //private Topic parent;

    public Topic() {
        subtopics = new HashSet<Topic>();
        events = new HashSet<Event>();
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

    public Set<Topic> getSubtopics() {
        return subtopics;
    }

    public Set<Event> getEvents() { return events; }


    //public Syllabus getSyllabus() { return syllabus; }

    //public void setSyllabus(Syllabus syllabus) { this.syllabus = syllabus; }


    //public Topic getParent() { return parent; }

    //public void setParent(Topic parent) { this.parent = parent; }

}
