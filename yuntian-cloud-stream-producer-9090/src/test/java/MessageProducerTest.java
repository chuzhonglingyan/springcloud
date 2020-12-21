import com.yuntian.StreamProducerApplication9090;
import com.yuntian.service.IMessageProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = {StreamProducerApplication9090.class})
public class MessageProducerTest {

    @Autowired
    private IMessageProducer iMessageProducer;


    @Test
    public void testSendMessage() {
        iMessageProducer.sendMessage("hello world-yuntian101");
    }


}
