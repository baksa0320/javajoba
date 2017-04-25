package spring;


import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class MemberDaoImpl implements MemberDao{
	private SqlSessionTemplate sqlSessionTemplate;

	public MemberDaoImpl(SqlSessionTemplate sqlSessionTemplate){
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public Member selectByEmail(String email){
		return sqlSessionTemplate.selectOne("selectByEmail", email);
	}
	
	@Override
	public Collection<Member> selectAll(){
		return sqlSessionTemplate.selectList("list");
	}
	
	@Override
	public int count(){
		return sqlSessionTemplate.selectOne("count");
	}
	
	@Override
	public void update(Member member){
		sqlSessionTemplate.update("update", member);
	}
	
	@Override
	public void insert(final Member member){
		sqlSessionTemplate.insert("insert", member);
	}
	
	@Override
	public List<Member> selectByRegdate(Date from, Date to){
		HashMap<String, Date> map = new HashMap<>();
		map.put("from", from);
		map.put("to", to);
		return sqlSessionTemplate.selectList("selectByRegdate", map);
	}
	
	@Override
	public Member selectById(Long id){
		List<Member> results = sqlSessionTemplate.selectList("selectById", id);
		return results.isEmpty() ? null : results.get(0);
	}
}
