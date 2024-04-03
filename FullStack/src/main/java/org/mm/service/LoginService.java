package org.mm.service;

import java.util.List;

import org.mm.model.AadharModel;
import org.mm.model.EducationModel;
import org.mm.model.LoginModel;
import org.mm.model.PanModel;
import org.mm.model.UserDetailModel;

public interface LoginService 
{
	int Save(LoginModel l);
	int SaveDetails(LoginModel lm,UserDetailModel um);
	int SaveEdu(LoginModel lm,EducationModel em);
	List<LoginModel> loadAll();
	LoginModel loadData(int id);
	void aadharSave(LoginModel lm, AadharModel am);
	void panSave(LoginModel lm, PanModel pm);
	void aadharEdit(AadharModel am);
}