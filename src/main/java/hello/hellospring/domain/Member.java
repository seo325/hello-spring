package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {
//    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen")
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="BOARD_SEQ", initialValue=1, allocationSize=1)
    private Long id;
    @Column(name ="name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
