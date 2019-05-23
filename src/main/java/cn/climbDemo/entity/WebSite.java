package cn.climbDemo.entity;

/**
 * ����Ϊ�ɼ�΢��������
 * 
 *
 */
public class WebSite {
		
	private int id;  				//���
	private String crawerUrl;	    //Ҫ�򿪵���ַ
	
	private String clickAccountNumberRule; //����˺Ź���
	private String clickPasswordRule;   // ����������
	private String clickRegisterRule;   //�����¼����
	
	private String searchInputRule;	//���������
	private String clickSearchRule;	    //�����������
	
	private String clickLookPersonRule; //������˹���
	private String cssGetPersonUrlRule;  //css��ȡ��ѯ����url����
	private String xpathGetPersonUrlRule;//xpath��ȡ��ѯ����url����
	
	private String clickAllTweetRule; //���ȫ��΢������
	private String bloggerNameRule; //�������ƹ���
	private String bloggerJobRule;	//������������
	private String bloggerAFTRule;	//������ע����˿��΢����������
	private String tweetModuleRule;	//΢��ģ�����
	private String tweetClickFullTitleRule;	//΢�����ȫ�Ĺ���
	private String tweetTitleRule;	//΢���������
	private String tweetTimeRule;	//΢������ʱ�����
	private String tweetImageUrlRule;	//΢��ͼƬ����
	private String tweetVideoUrlRule;	//΢����Ƶ����
	private String tweetTCLNumberRule;	//΢��ת�����۵��޹���
	private String tweetIVPath;		//΢��ͼƬ��Ƶ���λ��
	private String tweetNextRule;	//����΢����һҳ����
	
	

	
	private String articleRule;    //������¹���
	private String getArticleUrlRule; //��ȡ���¹���
	private String nextArticleRule;//���������һҳ����
	private String articleTitleRule; //���±������
	private String articleAuthorRule;//�������߹���
	private String articleTimeRule;  //���·���ʱ�����
	private String articleSourceUrlRule; //����Դ��ַ����
	private String articleReadNumber;	//�����Ķ�������
	private String articleContenrRule; //�������ݹ���
	private String articleTCLRule;	//����ת�������ۡ����޹���
	
	
	
	
	private String clickVideoRule;	   //�����Ƶ����
	private String videoModuleRule;	   // ��ȡvideoģ�����
	
	private String videoClickFullTitleRule; // �����Ƶ���Ƶ㿪ȫ�Ĺ���
	private String videoTitleRule;  //��ȡ��Ƶ�������
	private String videoImageUrlRule; //��ȡ��ƵͼƬurl����
	private String videoUrlRule;   //��ȡ��Ƶ���ӹ���
	private String videoTCLNumberRrule;	//��Ƶת�����۵�����������
	private String videoPath;	//��Ƶ���λ��
	private String nextVideoRule;  //�����Ƶ��һҳ����

	

	private String imageRule;	   //���ͼƬ����
	private String getImageRule;   //��ȡͼƬ����
	
	private String topicRule; 	   //����������
	private String getTopicRule;   //��ȡ�������
	
	private int pagenumber;	   //�ɼ�ҳ��


	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public String getArticleTitleRule() {
		return articleTitleRule;
	}


	public String getVideoClickFullTitleRule() {
		return videoClickFullTitleRule;
	}

	public void setVideoClickFullTitleRule(String videoClickFullTitleRule) {
		this.videoClickFullTitleRule = videoClickFullTitleRule;
	}


	public void setArticleTitleRule(String articleTitleRule) {
		this.articleTitleRule = articleTitleRule;
	}

	public String getArticleAuthorRule() {
		return articleAuthorRule;
	}

	public void setArticleAuthorRule(String articleAuthorRule) {
		this.articleAuthorRule = articleAuthorRule;
	}

	public String getArticleTimeRule() {
		return articleTimeRule;
	}

	public void setArticleTimeRule(String articleTimeRule) {
		this.articleTimeRule = articleTimeRule;
	}

	public String getArticleSourceUrlRule() {
		return articleSourceUrlRule;
	}

	public void setArticleSourceUrlRule(String articleSourceUrlRule) {
		this.articleSourceUrlRule = articleSourceUrlRule;
	}

	public String getArticleReadNumber() {
		return articleReadNumber;
	}

	public void setArticleReadNumber(String articleReadNumber) {
		this.articleReadNumber = articleReadNumber;
	}

	public String getArticleContenrRule() {
		return articleContenrRule;
	}

	public void setArticleContenrRule(String articleContenrRule) {
		this.articleContenrRule = articleContenrRule;
	}

	public String getArticleTCLRule() {
		return articleTCLRule;
	}

	public void setArticleTCLRule(String articleTCLRule) {
		this.articleTCLRule = articleTCLRule;
	}

	public String getClickAllTweetRule() {
		return clickAllTweetRule;
	}

	public void setClickAllTweetRule(String clickAllTweetRule) {
		this.clickAllTweetRule = clickAllTweetRule;
	}

	public String getTweetNextRule() {
		return tweetNextRule;
	}

	public void setTweetNextRule(String tweetNextRule) {
		this.tweetNextRule = tweetNextRule;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getCrawerUrl() {
		return crawerUrl;
	}

	


	public String getTweetClickFullTitleRule() {
		return tweetClickFullTitleRule;
	}

	public void setTweetClickFullTitleRule(String tweetClickFullTitleRule) {
		this.tweetClickFullTitleRule = tweetClickFullTitleRule;
	}

	public void setCrawerUrl(String crawerUrl) {
		this.crawerUrl = crawerUrl;
	}


	
	public String getTweetModuleRule() {
		return tweetModuleRule;
	}

	public void setTweetModuleRule(String tweetModuleRule) {
		this.tweetModuleRule = tweetModuleRule;
	}

	public String getBloggerNameRule() {
		return bloggerNameRule;
	}
	
	public String getBloggerAFTRule() {
		return bloggerAFTRule;
	}

	public void setBloggerAFTRule(String bloggerAFTRule) {
		this.bloggerAFTRule = bloggerAFTRule;
	}

	public void setBloggerNameRule(String bloggerNameRule) {
		this.bloggerNameRule = bloggerNameRule;
	}

	public String getBloggerJobRule() {
		return bloggerJobRule;
	}

	public void setBloggerJobRule(String bloggerJobRule) {
		this.bloggerJobRule = bloggerJobRule;
	}

	

	public String getTweetTitleRule() {
		return tweetTitleRule;
	}

	public void setTweetTitleRule(String tweetTitleRule) {
		this.tweetTitleRule = tweetTitleRule;
	}

	public String getTweetTimeRule() {
		return tweetTimeRule;
	}

	public void setTweetTimeRule(String tweetTimeRule) {
		this.tweetTimeRule = tweetTimeRule;
	}

	

	public String getTweetImageUrlRule() {
		return tweetImageUrlRule;
	}

	public void setTweetImageUrlRule(String tweetImageUrlRule) {
		this.tweetImageUrlRule = tweetImageUrlRule;
	}

	public String getTweetVideoUrlRule() {
		return tweetVideoUrlRule;
	}

	public void setTweetVideoUrlRule(String tweetVideoUrlRule) {
		this.tweetVideoUrlRule = tweetVideoUrlRule;
	}

	
	public String getTweetTCLNumberRule() {
		return tweetTCLNumberRule;
	}

	public void setTweetTCLNumberRule(String tweetTCLNumberRule) {
		this.tweetTCLNumberRule = tweetTCLNumberRule;
	}

	

	public String getVideoTCLNumberRrule() {
		return videoTCLNumberRrule;
	}

	public void setVideoTCLNumberRrule(String videoTCLNumberRrule) {
		this.videoTCLNumberRrule = videoTCLNumberRrule;
	}

	public String getTweetIVPath() {
		return tweetIVPath;
	}

	public void setTweetIVPath(String tweetIVPath) {
		this.tweetIVPath = tweetIVPath;
	}



	public String getSearchInputRule() {
		return searchInputRule;
	}

	public void setSearchInputRule(String searchInputRule) {
		this.searchInputRule = searchInputRule;
	}


	public String getClickAccountNumberRule() {
		return clickAccountNumberRule;
	}

	public void setClickAccountNumberRule(String clickAccountNumberRule) {
		this.clickAccountNumberRule = clickAccountNumberRule;
	}

	public String getClickPasswordRule() {
		return clickPasswordRule;
	}

	public void setClickPasswordRule(String clickPasswordRule) {
		this.clickPasswordRule = clickPasswordRule;
	}

	public String getClickRegisterRule() {
		return clickRegisterRule;
	}

	public void setClickRegisterRule(String clickRegisterRule) {
		this.clickRegisterRule = clickRegisterRule;
	}

	public String getClickSearchRule() {
		return clickSearchRule;
	}

	public void setClickSearchRule(String clickSearchRule) {
		this.clickSearchRule = clickSearchRule;
	}

	public String getClickLookPersonRule() {
		return clickLookPersonRule;
	}

	public void setClickLookPersonRule(String clickLookPersonRule) {
		this.clickLookPersonRule = clickLookPersonRule;
	}

	public String getCssGetPersonUrlRule() {
		return cssGetPersonUrlRule;
	}

	public void setCssGetPersonUrlRule(String cssGetPersonUrlRule) {
		this.cssGetPersonUrlRule = cssGetPersonUrlRule;
	}

	public String getXpathGetPersonUrlRule() {
		return xpathGetPersonUrlRule;
	}

	public void setXpathGetPersonUrlRule(String xpathGetPersonUrlRule) {
		this.xpathGetPersonUrlRule = xpathGetPersonUrlRule;
	}

	public String getArticleRule() {
		return articleRule;
	}

	public void setArticleRule(String articleRule) {
		this.articleRule = articleRule;
	}

	public String getGetArticleUrlRule() {
		return getArticleUrlRule;
	}

	public void setGetArticleUrlRule(String getArticleUrlRule) {
		this.getArticleUrlRule = getArticleUrlRule;
	}

	public String getNextArticleRule() {
		return nextArticleRule;
	}

	public void setNextArticleRule(String nextArticleRule) {
		this.nextArticleRule = nextArticleRule;
	}

	public String getClickVideoRule() {
		return clickVideoRule;
	}

	public void setClickVideoRule(String clickVideoRule) {
		this.clickVideoRule = clickVideoRule;
	}

	public String getVideoModuleRule() {
		return videoModuleRule;
	}

	public void setVideoModuleRule(String videoModuleRule) {
		this.videoModuleRule = videoModuleRule;
	}

	
	
	public String getVideoTitleRule() {
		return videoTitleRule;
	}

	public void setVideoTitleRule(String videoTitleRule) {
		this.videoTitleRule = videoTitleRule;
	}

	

	public String getVideoImageUrlRule() {
		return videoImageUrlRule;
	}

	public void setVideoImageUrlRule(String videoImageUrlRule) {
		this.videoImageUrlRule = videoImageUrlRule;
	}

	public String getVideoUrlRule() {
		return videoUrlRule;
	}

	public void setVideoUrlRule(String videoUrlRule) {
		this.videoUrlRule = videoUrlRule;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public String getNextVideoRule() {
		return nextVideoRule;
	}

	public void setNextVideoRule(String nextVideoRule) {
		this.nextVideoRule = nextVideoRule;
	}

	public String getImageRule() {
		return imageRule;
	}

	public void setImageRule(String imageRule) {
		this.imageRule = imageRule;
	}

	public String getGetImageRule() {
		return getImageRule;
	}

	public void setGetImageRule(String getImageRule) {
		this.getImageRule = getImageRule;
	}

	public String getTopicRule() {
		return topicRule;
	}

	public void setTopicRule(String topicRule) {
		this.topicRule = topicRule;
	}

	public String getGetTopicRule() {
		return getTopicRule;
	}

	public void setGetTopicRule(String getTopicRule) {
		this.getTopicRule = getTopicRule;
	}

	public int getPagenumber() {
		return pagenumber;
	}

	public void setPagenumber(int pagenumber) {
		this.pagenumber = pagenumber;
	}

		
	
}
