package link.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSessionFactory getSqlSessionFactory(){
		String resourceString = "conf.xml";
		InputStream isInputStream = MyBatisUtil.class.getClassLoader().getResourceAsStream(resourceString);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(isInputStream);
		return factory;
	}
	
	public static SqlSession getSession(){
		return getSqlSessionFactory().openSession();
	}
	
	public static SqlSession getSqlSession(boolean isAutoCommit){
		return getSqlSessionFactory().openSession(isAutoCommit);
	}

}
