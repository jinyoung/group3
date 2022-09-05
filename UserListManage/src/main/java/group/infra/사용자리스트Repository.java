package group.infra;

import group.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "사용자리스트",
    path = "사용자리스트"
)
public interface 사용자리스트Repository
    extends PagingAndSortingRepository<사용자리스트, Long> {
    // keep

}
