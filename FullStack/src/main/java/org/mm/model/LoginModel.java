package org.mm.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class LoginModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 150,unique = true)
	private String username;
	
	@Column(length = 50,unique = true)
	private String password;
	
	@OneToOne	
	private AadharModel aadharModel;
	
	@OneToOne
	private PanModel panModel;
	
	@OneToOne
	private UserDetailModel userDetailModel;
	
	@OneToOne
	private EducationModel educationModel;

	public LoginModel(String username, String password, AadharModel aadharModel, PanModel panModel,
			UserDetailModel userDetailModel, EducationModel educationModel) {
		super();
		this.username = username;
		this.password = password;
		this.aadharModel = aadharModel;
		this.panModel = panModel;
		this.userDetailModel = userDetailModel;
		this.educationModel = educationModel;
	}

	public LoginModel(int id, String username, String password, AadharModel aadharModel, PanModel panModel,
			UserDetailModel userDetailModel, EducationModel educationModel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.aadharModel = aadharModel;
		this.panModel = panModel;
		this.userDetailModel = userDetailModel;
		this.educationModel = educationModel;
	}

	public EducationModel getEducationModel() {
		return educationModel;
	}

	public void setEducationModel(EducationModel educationModel) {
		this.educationModel = educationModel;
	}

	public LoginModel(String username, String password, AadharModel aadharModel, PanModel panModel,
			UserDetailModel userDetailModel) {
		super();
		this.username = username;
		this.password = password;
		this.aadharModel = aadharModel;
		this.panModel = panModel;
		this.userDetailModel = userDetailModel;
	}

	public UserDetailModel getUserDetailModel() {
		return userDetailModel;
	}

	public void setUserDetailModel(UserDetailModel userDetailModel) {
		this.userDetailModel = userDetailModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AadharModel getAadharModel() {
		return aadharModel;
	}

	public void setAadharModel(AadharModel aadharModel) {
		this.aadharModel = aadharModel;
	}

	public PanModel getPanModel() {
		return panModel;
	}

	public void setPanModel(PanModel panModel) {
		this.panModel = panModel;
	}

	public LoginModel(int id, String username, String password, AadharModel aadharModel, PanModel panModel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.aadharModel = aadharModel;
		this.panModel = panModel;
	}

	public LoginModel(String username, String password, AadharModel aadharModel, PanModel panModel) {
		super();
		this.username = username;
		this.password = password;
		this.aadharModel = aadharModel;
		this.panModel = panModel;
	}

	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public LoginModel() {
		super();
	}
	
}
