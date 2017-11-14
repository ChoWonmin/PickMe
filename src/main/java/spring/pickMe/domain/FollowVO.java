package spring.pickMe.domain;

public class FollowVO {
	private String followingID;
	private String followerID;
	private boolean checking;
	
	public String getFollowingID() {
		return followingID;
	}
	public void setFollowingID(String followingID) {
		this.followingID = followingID;
	}
	public String getFollowerID() {
		return followerID;
	}
	public void setFollowerID(String followerID) {
		this.followerID = followerID;
	}
	public boolean isChecking() {
		return checking;
	}
	public void setChecking(boolean checking) {
		this.checking = checking;
	}
	
	
	
}
