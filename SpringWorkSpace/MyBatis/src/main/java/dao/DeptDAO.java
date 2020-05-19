package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.DeptVO;

public class DeptDAO {
	
	private SqlSession sqlSession;
	//SqlSessionTemplate - sqlSession 을 상속받아서 만든거당
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		
	}

	
	//select 메소드
	public List<DeptVO> selectList(){
		List<DeptVO> list = null;
		
		list = sqlSession.selectList("dept.dept_list");
		
		return list;
		
	}
}
