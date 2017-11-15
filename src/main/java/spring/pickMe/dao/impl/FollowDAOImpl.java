package spring.pickMe.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.pickMe.dao.FollowDAO;
import spring.pickMe.domain.FollowVO;
import spring.pickMe.domain.MemberVO;

@Repository
public class FollowDAOImpl implements FollowDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertFollow(FollowVO followVO) {
		int row = Integer.parseInt((String) sqlSession.selectOne("followMapper.idDuplicated",followVO));
		boolean idDuplicated = row>0;
		if(!idDuplicated)
			sqlSession.insert("followMapper.insertFollow",followVO);
	}
	
	@Override
	public void deleteFollow(FollowVO followVO) {
		sqlSession.delete("followMapper.deleteFollow",followVO);
	}
	@Override
	public void checkFollow(FollowVO followVO) {
		sqlSession.update("followMapper.checkFollow",followVO);
	}
	@Override
	public List<MemberVO> selectFollowCheckList(String memberId) {
		return sqlSession.selectList("followMapper.selectFollowCheckList",memberId);
	}
	@Override
	public List<MemberVO> selectFollowIdByMemberId(String memberId) {
		return sqlSession.selectList("followMapper.selectFollowIdByMemberId",memberId);
	}
	
	@Override
	public List<MemberVO> selectFollowedIdByMemberId(String memberId) {
		return sqlSession.selectList("followMapper.selectFollowedIdByMemberId",memberId);
	}
	
}

