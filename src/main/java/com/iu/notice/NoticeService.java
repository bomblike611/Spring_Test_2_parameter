package com.iu.notice;

import java.util.List;

public class NoticeService {
	
	private NoticeDAO noticeDAO;
	
	
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	public List<NoticeDTO> selectList() throws Exception{
		return noticeDAO.selectList();
	}
	
	public int insert(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.insert(noticeDTO);
	}
	
	public NoticeDTO selectOne(int num) throws Exception{
		return noticeDAO.selectOne(num);
	}
	
}
