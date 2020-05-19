package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.BoardVO;


public class BoardDAO {

	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<BoardVO> getList(){
		List<BoardVO> list = null;
		
		list = sqlSession.selectList("board.board_list");
		
		return list;
	}
	
	public BoardVO getContent(int seq) {

		sqlSession.update("board.readCount",seq);
		
		BoardVO vo = sqlSession.selectOne("board.getContent",seq);
		
		return vo;
	
	}
	
	
}


























