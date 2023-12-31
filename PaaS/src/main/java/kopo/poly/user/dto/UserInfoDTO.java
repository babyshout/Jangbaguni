package kopo.poly.user.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfoDTO {

    private String userId = "1";
    private String userName = "1";
    private String nickname = "1";
    private String password = "1";
    private String email = "1";
    private String addr1 = "1";
    private String addr2 = "1";
    private String job = "1";
    private String userType = "1";
    private String regId = "1";
    private String regDt = "1";
    private String chgId = "1";
    private String chgDt = "1";

    // 회원가입시, 중복가입을 방지 위해 사용할 변수
    // DB를 조회해서 회원이 존재하면 Y값을 반환함
    // DB테이블에 존재하지 않는 가상의 컬럼(ALIAS)
    private String existsYn = "1";

    // 이메일 중복체크를 위한 인증번호
    private int authNumber;
}
