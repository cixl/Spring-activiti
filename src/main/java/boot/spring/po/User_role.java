package boot.spring.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户角色")
@Data
public class User_role {
    int urid;
    @ApiModelProperty(hidden = true)
    User user;
    Role role;


}
