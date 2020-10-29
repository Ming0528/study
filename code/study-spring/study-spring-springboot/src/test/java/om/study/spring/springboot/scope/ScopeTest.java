package om.study.spring.springboot.scope;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.spring.springboot.scope.Abean;
import com.study.spring.springboot.scope.Bbean;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {ScopeTest.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class ScopeTest {
    @Resource
    private ApplicationContext context;

    @MockBean
    private Abean abean;

    @Test
    public void testScope() {
//        Abean abean = (Abean)context.getBean("AbeanName");
        abean.setId(111L);
        abean.setName("abeanName");
        System.out.println("abean hashCode is:" +  abean.hashCode());

        Abean aabean = (Abean)context.getBean("AbeanName");
        aabean.setId(111222L);
        aabean.setName("aabeanName");
        System.out.println("aabean hashCode is:" +  aabean.hashCode());

//        Bbean bbean = context.getBean(Bbean.class);
        Bbean bbean = (Bbean)context.getBean("BbeanName");
        bbean.setId(222L);
        bbean.setName("bbeanName");
        System.out.println("bbean hashCode is:" +  bbean.hashCode());

        Bbean bbbean = (Bbean)context.getBean("BbeanName");
        bbbean.setId(2211112L);
        bbbean.setName("bbbeanName");
        System.out.println("bbbean hashCode is:" +  bbbean.hashCode());
        System.out.println("end");
    }
}
