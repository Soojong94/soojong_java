package controller;

import model.MemberDAO;
import model.MemberDTO;

public class MemberController {

	private MemberDAO dao = new MemberDAO();

	public int join(MemberDTO dto) {
		return dao.join(dto);
	}

	public MemberDTO login(String id, String pw) {
		return dao.login(id, pw);
	}
	
	
	
	
	
	

}
