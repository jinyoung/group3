package group.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import group.config.kafka.KafkaProcessor;
import group.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MeetingRoomRepository meetingRoomRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reserved'"
    )
    public void wheneverReserved_회의실사용(@Payload Reserved reserved) {
        Reserved event = reserved;
        System.out.println(
            "\n\n##### listener 회의실사용 : " + reserved + "\n\n"
        );

        // Sample Logic //
        MeetingRoom.회의실사용(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationCanceled'"
    )
    public void wheneverReservationCanceled_회의실사용취소(
        @Payload ReservationCanceled reservationCanceled
    ) {
        ReservationCanceled event = reservationCanceled;
        System.out.println(
            "\n\n##### listener 회의실사용취소 : " +
            reservationCanceled +
            "\n\n"
        );

        // Sample Logic //
        MeetingRoom.회의실사용취소(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MeetingInformationChanged'"
    )
    public void wheneverMeetingInformationChanged_회의실사용정보변경(
        @Payload MeetingInformationChanged meetingInformationChanged
    ) {
        MeetingInformationChanged event = meetingInformationChanged;
        System.out.println(
            "\n\n##### listener 회의실사용정보변경 : " +
            meetingInformationChanged +
            "\n\n"
        );

        // Sample Logic //
        MeetingRoom.회의실사용정보변경(event);
    }
    // keep

}
