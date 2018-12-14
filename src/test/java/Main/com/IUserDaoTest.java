package Main.com;


import com.xiaoma.dao.NewsDao;
import com.xiaoma.dao.UsersDao;
import com.xiaoma.entity.NEWS;
import com.xiaoma.entity.USERS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * project helloSSM
 * authod wuyanhui
 * datetime 2017/11/23 16:45
 * desc
 */

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybaits.xml"})
public class IUserDaoTest {

    @Autowired
    private UsersDao dao;
    //private NewsDao newsDao;
    @Test
    public void testSelectUser() throws Exception {

       USERS user=dao.selectUser(1);
        System.out.println(user.getUSERNAME());
    }
}
