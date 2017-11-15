package spring.pickMe.dao;

import java.util.List;
import spring.pickMe.domain.FollowVO;
import spring.pickMe.domain.MemberVO;

public interface FollowDAO {
	void insertFollow(FollowVO followVO);
	List<MemberVO> selectFollowIdByMemberId(String id);
	void deleteFollow(FollowVO followVO);
	List<MemberVO> selectFollowCheckList(String id);
	void checkFollow(FollowVO followVO);
	List<MemberVO> selectFollowedIdByMemberId(String id);
}
