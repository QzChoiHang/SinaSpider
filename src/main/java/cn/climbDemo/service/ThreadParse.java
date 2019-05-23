package cn.climbDemo.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.climbDemo.dao.DownLoadImage;
import cn.climbDemo.dao.DownLoadVideo;
import cn.climbDemo.entity.BloggerInfo;
import cn.climbDemo.entity.BloggerTweet;
import cn.climbDemo.entity.BloggerTweetImageUrl;

public class ThreadParse implements Runnable {

	// ������Ƶ�̳߳�
	private ExecutorService downVideo = Executors.newFixedThreadPool(15);
	
	// ����ͼƬ�̳߳�
	private ExecutorService downImage = Executors.newFixedThreadPool(15);
	
	// ������Ϣ
	private BloggerInfo bloggerInfo;

	public ThreadParse(BloggerInfo bloggerInfo) {
		this.bloggerInfo = bloggerInfo;
	}

	@Override
	public void run() {
		parse();
	}

	public synchronized void parse() {
		
		
		for (BloggerTweet bloggerTweet : bloggerInfo.getBlogerTweetSet()) {

			if (bloggerTweet.getTweetIVPath() != null && !(bloggerTweet.getTweetIVPath().equals(""))) {

				// ������Ƶ
				if(bloggerTweet.getTweetVideoUrl() != null && !(bloggerTweet.getTweetVideoUrl().equals(""))) {
					DownLoadVideo downLoadVideo = new DownLoadVideo(bloggerTweet.getTweetIVPath(),bloggerTweet.getTweetVideoName(), bloggerTweet.getTweetVideoUrl());
					downVideo.execute(downLoadVideo);
					// �Ѳ���΢����Ϣ���뵽���ݿ�
					ShareVar.opMysql.insertBloggerTweet(bloggerTweet);
					 // downLoadVideo.notify();
				}
				
				if(bloggerTweet.getTweetImageUrl().size() >0) {
					for (BloggerTweetImageUrl imageUrl : bloggerTweet.getTweetImageUrl()) {
					
						if(imageUrl.getImageUrl() != null && !(imageUrl.getImageUrl().equals(""))) {
//							try {
//								imageUrl.wait();
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
							// ��ͼƬ��Ϣ���뵽���ݿ�
							ShareVar.opMysql.insertBloggerTweetImageUrl(imageUrl);
					
							// ����ͼƬ
							DownLoadImage downLoadImage = new DownLoadImage(bloggerTweet.getTweetIVPath(),imageUrl.getImageName(), imageUrl.getImageUrl());
							downImage.execute(downLoadImage);
						}
					}
				}
			}
		}
	}
}
