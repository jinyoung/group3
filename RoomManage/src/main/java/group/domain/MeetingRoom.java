package group.domain;

import group.RoomManageApplication;
import group.domain.MeetingRoomRegistered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MeetingRoom_table")
@Data
public class MeetingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomId;

    private String roomName;

    private String location;

    private Boolean used;

    private String remark;

    @PostPersist
    public void onPostPersist() {
        MeetingRoomRegistered meetingRoomRegistered = new MeetingRoomRegistered(
            this
        );
        meetingRoomRegistered.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {}

    public static MeetingRoomRepository repository() {
        MeetingRoomRepository meetingRoomRepository = RoomManageApplication.applicationContext.getBean(
            MeetingRoomRepository.class
        );
        return meetingRoomRepository;
    }

    public void 회의실삭제하다() {
        //
    }

    public void delete() {
        ConferenceRoomDeleted conferenceRoomDeleted = new ConferenceRoomDeleted(
            this
        );
        conferenceRoomDeleted.publishAfterCommit();
    }

    public static void 회의실사용(Reserved reserved) {
        /** Example 1:  new item 
        MeetingRoom meetingRoom = new MeetingRoom();
        repository().save(meetingRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(meetingRoom->{
            
            meetingRoom // do something
            repository().save(meetingRoom);


         });
        */

    }

    public static void 회의실사용취소(ReservationCanceled reservationCanceled) {
        /** Example 1:  new item 
        MeetingRoom meetingRoom = new MeetingRoom();
        repository().save(meetingRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(reservationCanceled.get???()).ifPresent(meetingRoom->{
            
            meetingRoom // do something
            repository().save(meetingRoom);


         });
        */

    }

    public static void 회의실사용정보변경(
        MeetingInformationChanged meetingInformationChanged
    ) {
        /** Example 1:  new item 
        MeetingRoom meetingRoom = new MeetingRoom();
        repository().save(meetingRoom);

        */

        /** Example 2:  finding and process
        
        repository().findById(meetingInformationChanged.get???()).ifPresent(meetingRoom->{
            
            meetingRoom // do something
            repository().save(meetingRoom);


         });
        */

    }
}
