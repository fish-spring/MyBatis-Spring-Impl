package dao;

import com.alibaba.fastjson.JSONObject;
import entity.Monkey;
import env.Base;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MonkeyTest extends Base {
    // 自动注入实现类
    @Autowired
    MonkeyDao monkeyDao;

    @Test
    public void selectMonkeys(){
        List<Monkey> monkeyList = monkeyDao.selectMonkeys();
        System.out.println(JSONObject.toJSONString(monkeyList));
        // [{"id":1,"name":"Sun WuKong","password":"123456"}]
    }
}
