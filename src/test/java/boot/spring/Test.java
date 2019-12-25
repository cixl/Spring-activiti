package boot.spring;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <一句话功能描述>
 * <功能详细描述>
 *
 * @author jianglei
 * @createTime 2019/12/25 9:09 AM
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    private ApplicationContext applicationContext;

    @org.junit.Test
    public void test1() {
        Bean1 bean1 = applicationContext.getBean(Bean1.class);
        System.out.println(bean1);
    }
}
