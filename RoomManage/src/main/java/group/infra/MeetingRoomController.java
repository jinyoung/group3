package group.infra;

import group.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/meetingRooms")
@Transactional
public class MeetingRoomController {

    @Autowired
    MeetingRoomRepository meetingRoomRepository;

    @RequestMapping(
        value = "meetingRooms/{id}/delete",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public MeetingRoom delete(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /meetingRoom/delete  called #####");
        Optional<MeetingRoom> optionalMeetingRoom = meetingRoomRepository.findById(
            id
        );

        optionalMeetingRoom.orElseThrow(() -> new Exception("No Entity Found"));
        MeetingRoom meetingRoom = optionalMeetingRoom.get();
        meetingRoom.delete();

        meetingRoomRepository.save(meetingRoom);
        return meetingRoom;
    }
    // keep
}
