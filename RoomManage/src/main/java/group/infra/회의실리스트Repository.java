package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "회의실리스트",
    path = "회의실리스트"
)
public interface 회의실리스트Repository
    extends PagingAndSortingRepository<회의실리스트, Long> {
    // keep

}
