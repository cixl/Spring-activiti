package boot.spring.pagemodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@ApiModel("分页组件")
@Data
public class DataGrid<T> {
    @ApiModelProperty("当前页面号")
    private int current;//当前页面号
    @ApiModelProperty("每页行数")
    private int rowCount;//每页行数
    @ApiModelProperty("总行数")
    private int total;//总行数
    @ApiModelProperty("数据内容")
    private List<T> rows;


}
