package cn.itcast;

import cn.itcast.dao.ItemDao;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test_01 {
    @Test
    public void test() {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemDao itemDao = app.getBean(ItemDao.class);
        List<Items> byId = itemDao.findById(1);
        System.out.println(byId);


    }

}
