package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 사용자등록됨 extends AbstractEvent {

    private Long id;

    public 사용자등록됨(주소록관리 aggregate) {
        super(aggregate);
    }

    public 사용자등록됨() {
        super();
    }
    // keep

}
