package service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yujt
 * @Date 2022/1/19 16:56
 * @Version 1.0
 */
@Service("facade")
@com.alibaba.dubbo.config.annotation.Service(loadbalance = "consistentHash")
public class FacadeImpl implements Facade {
    @Override
    public List<String> getList(String id) {
        System.out.println("调用成功");
        List<String> list = new ArrayList<>();
        list.add(id + "ABC");
        94
        return list;
    }
}
