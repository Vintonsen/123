package com.three.smbms.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

public class UserTest {

	//������־
	private Logger logger = Logger.getLogger(UserTest.class);
	
	@Test
	public void TestCount(){
		String resource ="mybatis-config.xml";
		int count = 0;
		SqlSession session = null;
		try{
			//��ȡ���������ļ�
			InputStream is = Resources.getResourceAsStream(resource);
			//����SqlSessionFactory����
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			//����SqlSession����
			session = factory.openSession();
			count = session.selectOne("com.three.smbms.user.UserMapper.count");
			logger.debug("User count--->" + count);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//�ر�session
			session.close();
		}

	}
}