package boot.spring.pagemodel;

import lombok.Data;

//正在运行的流程
@Data
public class RunningProcess {
    String executionid;
    String processInstanceid;
    String businesskey;
    String activityid;


}
