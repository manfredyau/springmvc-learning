import com.yau.mapper.UserMapper;
import com.yau.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class MyTest {
    @Test
    public void test1() throws IOException {
        SqlSessionFactory build = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(false);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserByUsername("Manfred");
        System.out.println(user);
    }
}
