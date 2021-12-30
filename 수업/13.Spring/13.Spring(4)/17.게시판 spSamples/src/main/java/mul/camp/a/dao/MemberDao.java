package mul.camp.a.dao;

import mul.camp.a.dto.MemberDto;

public interface MemberDao {

	int addmember(MemberDto mem);
	
	int getId(String id);
	
	MemberDto login(MemberDto mem);
}
