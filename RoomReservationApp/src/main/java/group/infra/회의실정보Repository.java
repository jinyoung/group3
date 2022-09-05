package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "회의실정보",
    path = "회의실정보"
)
public interface 회의실정보Repository
    extends PagingAndSortingRepository<회의실정보, Long> {
    // keep

}
