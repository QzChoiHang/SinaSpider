package cn.climbDemo.entity;

public class Article {

	private int id;
	private String title;  //����
	private String author; //����
	private String time;   //ʱ��
	private String sourceUrl; //Դ��ַ
	private String redeNumber;//�Ķ���
	private String content;	//����
	private String transmitNumber; //����ת����
	private String commentNumber; //����������
	private String likeNumber; //���µ�����
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getRedeNumber() {
		return redeNumber;
	}
	public void setRedeNumber(String redeNumber) {
		this.redeNumber = redeNumber;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTransmitNumber() {
		return transmitNumber;
	}
	public void setTransmitNumber(String transmitNumber) {
		this.transmitNumber = transmitNumber;
	}
	public String getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(String commentNumber) {
		this.commentNumber = commentNumber;
	}
	public String getLikeNumber() {
		return likeNumber;
	}
	public void setLikeNumber(String likeNumber) {
		this.likeNumber = likeNumber;
	}
	
}
