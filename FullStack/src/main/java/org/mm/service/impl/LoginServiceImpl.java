package org.mm.service.impl;

import java.util.List;

import org.mm.dao.LoginDAO;
import org.mm.model.AadharModel;
import org.mm.model.EducationModel;
import org.mm.model.LoginModel;
import org.mm.model.PanModel;
import org.mm.model.UserDetailModel;
import org.mm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO logindao;
	
	@Override
	public int Save(LoginModel l) {
		return logindao.Save(l);
	}

	@Override
	public List<LoginModel> loadAll() {
		return logindao.loadAll();
	}

	@Override
	public LoginModel loadData(int id) {
		return logindao.loadData(id);
	}

	@Override
	public void aadharSave(LoginModel lm, AadharModel am) {
		logindao.aadharSave(lm, am);
	}

	@Override
	public void aadharEdit(AadharModel am) {
		logindao.aadharEdit(am);	
	}

	@Override
	public int SaveDetails(LoginModel lm, UserDetailModel um) {
		return logindao.SaveDetails(lm, um);
	}

	@Override
	public void panSave(LoginModel lm, PanModel pm) {
		logindao.panSave(lm, pm);
		
	}

	@Override
	public int SaveEdu(LoginModel lm, EducationModel em) {
		
		return logindao.SaveEdu(lm, em);
	}

}