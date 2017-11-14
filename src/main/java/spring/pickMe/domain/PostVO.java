package spring.pickMe.domain;

public class PostVO {
	
	private String postNo;
	private String writer;
	private String content;
	private String postDate;
	private int hit;
	private String field;
	private boolean isPersonPost;
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public boolean isPersonPost() {
		return isPersonPost;
	}
	public void setPersonPost(boolean isPersonPost) {
		this.isPersonPost = isPersonPost;
	}
	
	
	
}
