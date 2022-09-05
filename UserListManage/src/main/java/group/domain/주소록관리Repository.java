package group.domain;

import group.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "주소록관리",
    path = "주소록관리"
)
public interface 주소록관리Repository
    extends PagingAndSortingRepository<주소록관리, Long> {}
