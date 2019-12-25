package boot.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static java.lang.System.out;

/**
 * <一句话功能描述>
 * <功能详细描述>
 *
 * @author jianglei
 * @createTime 2019/12/25 9:10 AM
 */
@Component
public class Bean1 implements ApplicationContextAware {
    public Bean1() {
        out.println("Bean1 is constructed.");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        out.println("aware happened.");
    }

    @PostConstruct
    public void post() {
        out.println("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        out.println("pre destroy");
    }
}
