package group.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "회의실리스트_table")
@Data
public class 회의실리스트 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
