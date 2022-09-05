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
// @RequestMapping(value="/주소록관리")
@Transactional
public class 주소록관리Controller {

    @Autowired
    주소록관리Repository 주소록관리Repository;

    @RequestMapping(
        value = "주소록관리/{id}/참석가능사용자삭제",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public 주소록관리 참석가능사용자삭제(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /주소록관리/참석가능사용자삭제  called #####"
        );
        Optional<주소록관리> optional주소록관리 = 주소록관리Repository.findById(
            id
        );

        optional주소록관리.orElseThrow(() -> new Exception("No Entity Found"));
        주소록관리 주소록관리 = optional주소록관리.get();
        주소록관리.참석가능사용자삭제();

        주소록관리Repository.save(주소록관리);
        return 주소록관리;
    }
    // keep
}
