package attetch.spring.dto;

import java.util.Date;

public class AttachVO {
	private int ano;
	private String uploadPath;
	private String fileName;
	private String fileType;
	private int pno;
	private String attacher;
	private Date regDate;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getAttacher() {
		return attacher;
	}
	public void setAttacher(String attacher) {
		this.attacher = attacher;
	}
	public Date getRegdate() {
		return regDate;
	}
	public void setRegdate(Date regdate) {
		this.regDate = regdate;
	}
	
	
}
