package cn.mapper;

import java.util.List;

import cn.climbDemo.entity.BloggerInfo;
import cn.climbDemo.entity.BloggerTweet;
import cn.climbDemo.entity.BloggerTweetImageUrl;
import cn.climbDemo.entity.Keywords;
import cn.climbDemo.entity.WebSite;

public interface OperationMysqlMapper {

	/**
	 * ��ȡ����
	 */
	WebSite getWebSite();
	
	/**
	 * ��ȡ�ؼ���
	 */
	List<Keywords> queryKeyWords();
	
	/**
	 * ���벩����Ϣ
	 */
	void insertBloggerInfo(BloggerInfo bloggerInfo);
	
	/**
	 * ���벩������΢����Ϣ
	 * @param bloggerTweet
	 */
	void insertBloggerTweet(BloggerTweet bloggerTweet);
	
	/**
	 * ���벩������΢����ͼƬ����
	 * @param bloggerTweetImageUrl
	 */
	void insertBloggerTweetImageUrl(BloggerTweetImageUrl bloggerTweetImageUrl);
	
	
	
	
	void updateKeyWord(int id);
	
	void updateKeyWords();
	
}
