package com.study.spring.springboot.scope;

import lombok.Data;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/10/22 12:52 <br>
 * @package com.study.spring.springboot.scope <br>
 */
@Data
public abstract class AbstractBTest implements IBeanTest {
    private String name;
}
