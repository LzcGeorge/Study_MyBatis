import com.selfknow.dao.UserMapper;
import com.selfknow.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.selfknow.utils.MybatisUtils;

import java.util.List;

public class MyTest {
    @Test
    public void test1() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for(User user: userList)
            System.out.println(user);

        session.close();
    }

    @Test
    public void test2() {
        SqlSession session = MybatisUtils.getSqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);

        User form = new User("selfknow","123");
        User user = mapper.selectByUser(form);
//        User user = mapper.selectByUP("selfknow", "123");
//        User user = mapper.selectByUsername("selfknow");

        System.out.println(user);
        System.out.println(user == form);
    }
}
