package boot.spring.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class Permission {
    int pid;
    String permissionname;
    @ApiModelProperty(hidden = true)
    List<Role_permission> rp;


}
