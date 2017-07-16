package link.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import link.mybatis.domain.User;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test1 {
	public static void main(String[] srgs) throws IOException{
		String resource = "conf.xml";
		InputStream is=Test1.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		String statement = "link.mybatis.mapping.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		System.out.println(user);
	}

}
