package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "예약리스트",
    path = "예약리스트"
)
public interface 예약리스트Repository
    extends PagingAndSortingRepository<예약리스트, Long> {
    // keep

}
