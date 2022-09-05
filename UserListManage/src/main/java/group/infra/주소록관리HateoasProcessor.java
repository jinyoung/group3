package group.infra;

import group.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 주소록관리HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<주소록관리>> {

    @Override
    public EntityModel<주소록관리> process(EntityModel<주소록관리> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/참석가능사용자삭제"
                )
                .withRel("참석가능사용자삭제")
        );

        return model;
    }
}
