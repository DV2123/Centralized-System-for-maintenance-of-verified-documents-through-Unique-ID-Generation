package org.mm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "aadhar")
public class AadharModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 150)
	private String aadharName;
	
	@Column(length = 50, unique = true)
	private String aadharNo;
	
    @Lob
    @Column
    private byte[] aadharImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadharName() {
		return aadharName;
	}

	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public byte[] getAadharImage() {
		return aadharImage;
	}

	public void setAadharImage(byte[] aadharImage) {
		this.aadharImage = aadharImage;
	}

	public AadharModel(int id, String aadharName, String aadharNo, byte[] aadharImage) {
		super();
		this.id = id;
		this.aadharName = aadharName;
		this.aadharNo = aadharNo;
		this.aadharImage = aadharImage;
	}

	public AadharModel(String aadharName, String aadharNo, byte[] aadharImage) {
		super();
		this.aadharName = aadharName;
		this.aadharNo = aadharNo;
		this.aadharImage = aadharImage;
	}

	public AadharModel() {
		super();
	}

}
