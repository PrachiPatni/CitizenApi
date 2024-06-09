package in.prachi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.time.LocalDateTime;

@Entity
@Table(name = "citizen")
public class Citizen extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String citizenName;
    private String dob;
    private String email;
    private Long phno;
    private String gender;
    

    // Constructors, getters, and setters

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Citizen() {
        // Default constructor
    }

    public Citizen(String citizenName, String dob, String email, Long phno, String gender, String createdBy, LocalDateTime createdDate) {
        super(createdBy, createdDate);
        this.citizenName = citizenName;
        this.dob = dob;
        this.email = email;
        this.phno = phno;
        this.gender = gender;
    }

    // Additional methods or attributes specific to the Citizen class

}

// Another class that Citizen extends
class BaseEntity {

    private String createdBy;
    private LocalDateTime createdDate;

    public BaseEntity() {
        // Default constructor
    }

    public BaseEntity(String createdBy, LocalDateTime createdDate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    // Additional methods or attributes common to all entities

}
