package group.domain;

import group.RoomReservationAppApplication;
import group.domain.MeetingInformationChanged;
import group.domain.ReservationCanceled;
import group.domain.Reserved;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Conference_table")
@Data
public class Conference {

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

    @PostPersist
    public void onPostPersist() {
        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();
        // Get request from MeetingRoom
        //group.external.MeetingRoom meetingRoom =
        //    Application.applicationContext.getBean(group.external.MeetingRoomService.class)
        //    .getMeetingRoom(/** mapping value needed */);

    }

    @PreUpdate
    public void onPreUpdate() {
        MeetingInformationChanged meetingInformationChanged = new MeetingInformationChanged(
            this
        );
        meetingInformationChanged.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        ReservationCanceled reservationCanceled = new ReservationCanceled(this);
        reservationCanceled.publishAfterCommit();
    }

    public static ConferenceRepository repository() {
        ConferenceRepository conferenceRepository = RoomReservationAppApplication.applicationContext.getBean(
            ConferenceRepository.class
        );
        return conferenceRepository;
    }
}
