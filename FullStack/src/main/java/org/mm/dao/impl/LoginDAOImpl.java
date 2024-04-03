package org.mm.dao.impl;

import java.util.List;

import org.mm.dao.LoginDAO;
import org.mm.model.AadharModel;
import org.mm.model.EducationModel;
import org.mm.model.LoginModel;
import org.mm.model.PanModel;
import org.mm.model.UserDetailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int Save(LoginModel l) {
		
		return (int)hibernateTemplate.save(l);
	}

	@Override
	public List<LoginModel> loadAll() {
		
		return hibernateTemplate.loadAll(LoginModel.class);
	}

	@Override
	public LoginModel loadData(int id) {
		return hibernateTemplate.get(LoginModel.class, id);
	}

	@Transactional
	@Override
	public void aadharSave(LoginModel lm, AadharModel am) {
		lm.setAadharModel(am);
		hibernateTemplate.saveOrUpdate(am);
		hibernateTemplate.saveOrUpdate(lm);
	}

	@Transactional
	@Override
	public void aadharEdit(AadharModel am) {
		hibernateTemplate.saveOrUpdate(am);
	}

	@Transactional
	@Override
	public int SaveDetails(LoginModel lm,UserDetailModel um) {
		hibernateTemplate.saveOrUpdate(lm);
		hibernateTemplate.saveOrUpdate(um);
		lm.setUserDetailModel(um);
		return 0;
	}

	@Transactional
	@Override
	public void panSave(LoginModel lm, PanModel pm) {
		lm.setPanModel(pm);
		hibernateTemplate.saveOrUpdate(pm);
		hibernateTemplate.saveOrUpdate(lm);
	}

	@Transactional
	@Override
	public int SaveEdu(LoginModel lm, EducationModel em) {
		lm.setEducationModel(em);
		hibernateTemplate.saveOrUpdate(em);
		hibernateTemplate.saveOrUpdate(lm);
		return 0;
	}

}
