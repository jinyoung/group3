package group.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "예약리스트_table")
@Data
public class 예약리스트 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
