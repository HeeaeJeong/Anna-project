package mul.camp.a.dao;

import java.util.List;

import mul.camp.a.dto.BbsDto;

public interface BbsDao {

	List<BbsDto> bbslist();
	
	int writebbs(BbsDto dto);
}
