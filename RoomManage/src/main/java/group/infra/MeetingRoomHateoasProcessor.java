package group.infra;

import group.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MeetingRoomHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MeetingRoom>> {

    @Override
    public EntityModel<MeetingRoom> process(EntityModel<MeetingRoom> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/delete")
                .withRel("delete")
        );

        return model;
    }
}
