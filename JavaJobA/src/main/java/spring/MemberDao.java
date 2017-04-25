package spring;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface MemberDao {
	public Member selectByEmail(String email);
	public Collection<Member> selectAll();
	public int count();
	public void update(Member member);
	public void insert(final Member member);
	public List<Member> selectByRegdate(Date from, Date to);
	public Member selectById(Long id);
}
