package cn.climbDemo.service;

public class StringDenoising {

	
	/**
	 * ȥ��·����һЩ�Ƿ��ַ�
	 * @param 
	 * @return
	 */
	public String pathIllegalCharacter(String path) {
		try {
			path = path.replaceAll("/", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("\\", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll(":", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("\"", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("|", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("*", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("<", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("<", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll(">", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("'", "");
		} catch (Exception e) {
		}
		try {
			path = path.replaceAll("\r\n", "");
		} catch (Exception e) {
		}
		return path;
	}

}
