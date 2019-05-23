package cn.climbDemo.service;

import java.util.LinkedHashSet;
import java.util.Set;

import cn.climbDemo.dao.OperationMongodb;
import cn.climbDemo.dao.OperationMysql;
import cn.climbDemo.entity.BloggerInfo;
import cn.climbDemo.entity.BloggerTweetImageUrl;
import cn.climbDemo.entity.Video;
import cn.climbDemo.entity.WebSite;

/**
 * �����ṩһЩ���ñ����͹�������
 * 
 */
public class ShareVar {

	
	
	// �ַ�������
	public static StringDenoising strDenoising = new StringDenoising();

	// ����MySQL���ݿ�
	public static OperationMysql opMysql = new OperationMysql();

	// ����Mongodb���ݿ�
	public static OperationMongodb opMongoDB = new OperationMongodb();
	
	
	
	public static Set<BloggerInfo> bloggerSet = new LinkedHashSet<BloggerInfo>();// ������Ϣ����
	private static int bloggerId=1; // ����id
	public synchronized static int getBloggerId() {
		int id = bloggerId;
		bloggerId++;
		return id;
	}
	private static int bloggetTweetId = 1; //����΢��id
	public synchronized static int getBloggetTweetId() {
		int id =bloggetTweetId;
		bloggetTweetId++;
		return id;
	}
	

	




	// ��Ƶ����
	public static Set<Video> videoSet = new LinkedHashSet<Video>();
	private static int videoId = 1; //��Ƶid
	public synchronized static int getVideoId() {
		int id = videoId;
		videoId++;
		return id;
	}


	public static Set<BloggerTweetImageUrl> imageSet = new LinkedHashSet<BloggerTweetImageUrl>(); // ͼƬ����
	// public static Set<String> imageSet = new LinkedHashSet<String>(); // ͼƬ����
	private static int imageId = 1; //ͼƬid
	public synchronized static int getImageId() {
		int id = imageId;
		imageId++;
		return id;
	}
	
	
	
	// ���¼���
	public static Set<String> articleSet = new LinkedHashSet<String>();
			
	// ���⼯��
	public static Set<String> topicSet = new LinkedHashSet<String>();
			
	// ����
	public static WebSite wbs = opMysql.getWebSite(); // ��ȡ����
	
	/**
	 * ���߳�˯��
	 * 
	 * @param time
	 *            ��Ҫ˯�ߵ�ʱ��
	 */
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
