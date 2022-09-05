package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private Long reserveId;
    private Date reserveStartTime;
    private Date reserveEndTime;
    private String reserveName;
    private Integer roomId;
    private Integer hostId;
    private Integer userId1;
    private Integer userId2;
    private Integer userId3;
    private Integer userId4;
    private Integer userId5;
    // keep

}
