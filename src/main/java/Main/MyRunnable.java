package Main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import cn.climbDemo.service.HtmlParseTool;

public class MyRunnable implements Runnable {

	ScheduledExecutorService ses;
		
	public MyRunnable(ScheduledExecutorService ses) {
		this.ses = ses;
	}

	public void run() {
		
		HtmlParseTool.start();
		if(ses!=null)
			ses.schedule(new MyRunnable(ses), getNextTime(), TimeUnit.SECONDS);
	}

	
	/**
	 * ��ȡ�´�ִ�е�����
	 * @return 
	 */
	public long getNextTime() {

		// ��ȡ��ǰʱ��
		LocalDateTime ldt = LocalDateTime.now();
		
		// ��ȡ�´�ִ��ʱ��
		LocalDateTime ldt2 = convertDateToLDT(getDate());
		
		// �ѵ�ǰʱ��ת��Ϊ����
		long currentTimeSec = getMilliByTime(ldt);

		// ���´�ʱ��ת��Ϊ����
		long nextTimeSec = getMilliByTime(ldt2);

		// ���´�ִ��ʱ���������ȥ��ǰʱ�������
		return nextTimeSec-currentTimeSec;
	}
	
	/**
	 * ��ȡ�´�ִ��ʱ���date
	 */
	@SuppressWarnings("deprecation")
	public Date getDate() {
		
		Date date = new Date();// ��ȡʱ��
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, 1);// ��������������һ��.����������,������ǰ�ƶ�
		date = calendar.getTime(); // ���ʱ���������������һ��Ľ��
		date.setHours(8); // ��ʱ����Ϊÿ��8��
		date.setMinutes(0); // �ѷ�����Ϊ0
		date.setSeconds(0); // ������Ϊ0
		
		return date;
	}
	
	/**
	 *  Dateת��ΪLocalDateTime
	 * @param date
	 * @return
	 */
    public LocalDateTime convertDateToLDT(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }
    
    /**
     * ��ȡָ�����ڵĺ���
     * @param time
     * @return
     */
    public long getMilliByTime(LocalDateTime time) {
        return time.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }



}
