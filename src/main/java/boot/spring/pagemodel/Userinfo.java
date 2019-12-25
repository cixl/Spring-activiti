package boot.spring.pagemodel;

import lombok.Data;

@Data
public class Userinfo {
    int id;
    String username;
    String password;
    String tel;
    int age;
    String rolelist;

}
