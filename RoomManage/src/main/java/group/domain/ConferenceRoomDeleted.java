package group.domain;

import group.domain.*;
import group.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ConferenceRoomDeleted extends AbstractEvent {

    private Long id;
    private Long roomId;
    private String roomName;
    private String location;
    private Boolean used;
    private String remark;

    public ConferenceRoomDeleted(MeetingRoom aggregate) {
        super(aggregate);
    }

    public ConferenceRoomDeleted() {
        super();
    }
    // keep

}
