package spring.pickMe.domain;

public class MessageVO {
	private int messageNo;
	private String sender;
	private String reciever;
	private String contenr;
	private boolean checking;
	public int getMessageNo() {
		return messageNo;
	}
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getContenr() {
		return contenr;
	}
	public void setContenr(String contenr) {
		this.contenr = contenr;
	}
	public boolean isChecking() {
		return checking;
	}
	public void setChecking(boolean checking) {
		this.checking = checking;
	}
	
}
