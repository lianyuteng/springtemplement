package smallone;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.User;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class DaoTest {

	@Resource(name = "templement")
	private JdbcTemplate templement;

	@Test
	public void hehe() {

		try {
			InputStream resourceAsStream = Resources.getResourceAsStream("ibatis.xml");
			if( null == resourceAsStream)
				System.out.println("lianjieshibai");
			SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
			SqlSession session = build.openSession();
			Object one = session.selectOne("wocaonimabi.selectone", 1);
			System.out.println("zhixingdaozhelma");
			System.out.println(one.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


