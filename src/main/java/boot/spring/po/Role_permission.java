package boot.spring.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Role_permission {
    int rpid;
    Role role;
    @ApiModelProperty(hidden = true)
    Permission permission;

}
