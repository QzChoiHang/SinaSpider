package cn.climbDemo.entity;

public class Keywords {

	private int id;	// ���
	private String keyword; //�ؼ���
	private int serchWhere;	//����ʲô��������
	private int state; //�ɼ�״̬
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getSerchWhere() {
		return serchWhere;
	}
	public void setSerchWhere(int serchWhere) {
		this.serchWhere = serchWhere;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
