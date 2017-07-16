package link.mybatis.test;

import link.mybatis.domain.User;
import link.mybatis.util.MyBatisUtil;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCRUDByXmlMapper {

	@Test
	public void testAdd(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="link.mybatis.mapping.userMapper.addUser";
		User user = new User();
		user.setName("testadd");
		user.setAge(18);
		System.out.println(user);
		int retResult = sqlSession.insert(statement,true);
		sqlSession.close();
		System.out.println(retResult);
	}
	
	@Test
	public void testDelete(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		String statement="link.mybatis.mapping.userMapper.deleteUser";
		int retResult = sqlSession.delete(statement, 8);
		sqlSession.close();
		System.out.println(retResult);
		
	}
}
