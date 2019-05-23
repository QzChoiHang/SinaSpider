package cn.climbDemo.dao;

import cn.climbDemo.entity.BloggerInfo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class OperationMongodb {

	private Mongo mg = null;
	private DB db;
	private DBCollection ruleData;


	public OperationMongodb() {
		init();
	}

	@SuppressWarnings("deprecation")
	private void init() {
		try {
			mg = new Mongo("localhost", 27017);
		} catch (MongoException e) {
			e.printStackTrace();
		}
		// ��ȡtemp DB�����Ĭ��û�д�����mongodb���Զ�����
		db = mg.getDB("crawlerTweet");
		
		ruleData = db.getCollection("ruleData");
	}

	/**
	 * �������
	 * @param mation
	 */
	public void addRuleData(BloggerInfo mation) {
		DBObject user = new BasicDBObject();
	
		ruleData.save(user);
	}


}
