package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.camp.a.dao.BbsDao;
import mul.camp.a.dto.BbsDto;

@Service
public class BbsServiceImpl implements BbsService{

	@Autowired
	BbsDao dao;

	@Override
	public List<BbsDto> bbslist() {		
		return dao.bbslist();
	}

	@Override
	public boolean writebbs(BbsDto dto) {
		int count = dao.writebbs(dto);
		return count>0?true:false;
	}

	@Override
	public BbsDto getBbs(int seq) {		
		return dao.getBbs(seq);
	}
	
	
	
}




