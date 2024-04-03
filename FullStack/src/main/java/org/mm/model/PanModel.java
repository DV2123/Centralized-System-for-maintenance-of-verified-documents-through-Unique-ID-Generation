package org.mm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "pancard")
public class PanModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 150)
	private String panName;
	
	@Column(length = 50, unique = true)
	private String panNo;

    @Lob
    @Column
    private byte[] panImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanName() {
		return panName;
	}

	public void setPanName(String panName) {
		this.panName = panName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public byte[] getpanImage() {
		return panImage;
	}

	public void setpanImage(byte[] panImage) {
		this.panImage = panImage;
	}

	public PanModel(int id, String panName, String panNo, byte[] panImage) {
		super();
		this.id = id;
		this.panName = panName;
		this.panNo = panNo;
		this.panImage = panImage;
	}

	public PanModel(String panName, String panNo, byte[] panImage) {
		super();
		this.panName = panName;
		this.panNo = panNo;
		this.panImage = panImage;
	}

	public PanModel() {
		super();
	}
 
}
