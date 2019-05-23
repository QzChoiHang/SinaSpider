package cn.climbDemo.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.climbDemo.entity.BloggerInfo;
import cn.climbDemo.entity.BloggerTweet;
import cn.climbDemo.entity.BloggerTweetImageUrl;
import cn.climbDemo.entity.Keywords;
import cn.climbDemo.entity.WebSite;
import cn.mapper.OperationMysqlMapper;


public class OperationMysql {

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private OperationMysqlMapper mysqlMappe;
	// private Jedis jedis = new Jedis("localhost",6380);
	
	public OperationMysql() {
		// ����SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		// ����SqlMapConfig.xml�����ļ�
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ����SqlsessionFactory
		this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		// ��ȡsqlSession����spring���Ϻ���spring����
		sqlSession = this.sqlSessionFactory.openSession();
		// ��sqlSession�л�ȡMapper�ӿڵĴ������
		mysqlMappe = sqlSession.getMapper(OperationMysqlMapper.class);
	}

	/**
	 * ��ѯWebSite��������й���
	 * 
	 * @return WebSite �������й���
	 */
	public WebSite getWebSite() {
		// ִ�в�ѯ����
		WebSite wbs = mysqlMappe.getWebSite();
		return wbs;
	}

	/**
	 * ��ȡ�ؼ���
	 * 
	 * @return �ؼ��� List ����
	 */
	public List<Keywords> queryKeyWord() {
		List<Keywords> keywords = mysqlMappe.queryKeyWords();
		return keywords;
	}


	/**
	 * ���벩����Ϣ
	 * 
	 * @param blgggerInfo
	 */
	public synchronized void insertBloggerInfo(BloggerInfo blgggerInfo) {
		mysqlMappe.insertBloggerInfo(blgggerInfo);
		sqlSession.commit();
	}

	
	/**
	 * ���벩������΢��
	 */
	public synchronized void insertBloggerTweet(BloggerTweet bloggerTweet) {
		mysqlMappe.insertBloggerTweet(bloggerTweet);
		sqlSession.commit();
	}
	
	/**
	 * ���벩��������Ϣ��ͼƬ
	 */
	public synchronized void insertBloggerTweetImageUrl(BloggerTweetImageUrl bloggerTweetImageUrl) {
		mysqlMappe.insertBloggerTweetImageUrl(bloggerTweetImageUrl);
		sqlSession.commit();
	}
	
	
	/**
	 * �ر�mysql������
	 */
	public void closeMySQL() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}

	
	
//	/**
//	 * ��ȡ Redis ���ݿ����������Url
//	 * 
//	 * @return
//	 */
//	public Jedis setUrlList() {
//		Set<String> hkeys = jedis.hkeys("urls");
//		for (String string : hkeys) {
//			jedis.set(string, "urlList");
//		}
//		return jedis;
//	}
	
//	public void insertUrlList() {
//		
//	}
	
}
