package boot.spring.pagemodel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PurchaseTask {
    int bussinesskey;
    String applyer;
    String itemlist;
    BigDecimal total;
    Date applytime;
    String taskid;
    String taskname;
    String processinstanceid;
    String processdefid;

}
