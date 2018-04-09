package com.three.smbms.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.three.smbms.pojo.Provider;
import com.three.smbms.utils.MyBatisUtil;

public class ProviderTest {

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
			count = session.selectOne("com.three.smbms.provider.ProviderMapper.count");
			logger.debug("User count--->" + count);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//�ر�session
			session.close();
		}

	}
	
	@Test
	public void TestgetProviderList(){
		List<Provider> list = new ArrayList<Provider>();
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList("com.three.smbms.provider.ProviderMapper.getProviderList");
			for(Provider u:list){
				logger.debug("proName:" + u.getProName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}
}
