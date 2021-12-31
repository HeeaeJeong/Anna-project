package mul.camp.a.service;

import mul.camp.a.dto.MemberDto;

public interface MemberService {

	boolean addmember(MemberDto mem);	
	int getId(String id);
	MemberDto login(MemberDto mem);
}
