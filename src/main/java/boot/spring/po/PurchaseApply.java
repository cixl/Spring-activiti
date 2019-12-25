package boot.spring.po;

import lombok.Data;
import org.activiti.engine.task.Task;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PurchaseApply {
    int id;
    String itemlist;
    BigDecimal total;
    Date applytime;
    String applyer;
    Task task;

}
