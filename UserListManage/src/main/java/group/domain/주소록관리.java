package group.domain;

import group.UserListManageApplication;
import group.domain.사용자등록됨;
import group.domain.사용자삭제됨;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "주소록관리_table")
@Data
public class 주소록관리 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;

    private String userPhoneNumber;

    private String userEmail;

    @PostPersist
    public void onPostPersist() {
        사용자등록됨 사용자등록됨 = new 사용자등록됨(this);
        사용자등록됨.publishAfterCommit();

        사용자삭제됨 사용자삭제됨 = new 사용자삭제됨(this);
        사용자삭제됨.publishAfterCommit();
    }

    public static 주소록관리Repository repository() {
        주소록관리Repository 주소록관리Repository = UserListManageApplication.applicationContext.getBean(
            주소록관리Repository.class
        );
        return 주소록관리Repository;
    }

    public void 참석가능사용자삭제() {}
}
