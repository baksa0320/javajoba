package spring;

public class MemberInfoPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void setMemberDao(MemberDao memberDao){
		this.memberDao = memberDao;
	}
	
	public void setMemberPrinter(MemberPrinter printer){
		this.printer = printer;
	}
	
	public void printMemberInfo(String email){
		Member member = memberDao.selectByEmail(email);
		if(member == null){
			System.out.println("정보 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}
