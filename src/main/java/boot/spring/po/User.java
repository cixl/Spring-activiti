package boot.spring.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("用户")
public class User {
    int uid;
    String username;
    String password;
    String tel;
    int age;
    @ApiModelProperty(hidden = true)
    List<User_role> user_roles;


    @Override
    public String toString() {
        return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", tel=" + tel + ", age=" + age + ", " +
                "user_roles=" + user_roles + "]";
    }


}
