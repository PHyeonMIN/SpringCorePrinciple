package hello.aop.internalcall;

import hello.aop.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * ObjectProvider(Provider), ApplicationContext를 사용해서 지연 ( Lazy ) 조회
 */
@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest             // 스프링 컨테이너를 띄움
class CallServiceV3Test {
    @Autowired
    CallServiceV3 callServiceV3;

    @Test
    void external() {
        callServiceV3.external();
    }


}