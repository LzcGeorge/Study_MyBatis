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
}
