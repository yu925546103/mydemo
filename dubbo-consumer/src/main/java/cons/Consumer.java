package cons;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.Facade;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yujt
 * @Date 2022/1/19 18:17
 * @Version 1.0
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(loadbalance = "consistentHash")
public class Consumer implements ConsumerInterface {
    @Resource
    private Facade facade;


    @Override
    @Transactional
    public List<String> result(String id) {
        System.out.println("获得结果");
        JSON.parseObject()
        return facade.getList("123");
    }
}
