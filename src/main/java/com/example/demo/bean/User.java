package com.example.demo.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;  //id作为主键，并且设置自增
	private String firstName;
    private String lastName;
    private String username;
    private String password;
    
    @CreationTimestamp
    private Date created_time;
    
    //一对多映射关系，一个用户可以又多个相册，一个相册只属于一个用户
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JsonManagedReference
//    private List<Photo> photolist;
//    
//    //多对多的关系，用于可以i喜欢多个相册，相册也可以被多个用户喜欢
//    @ManyToMany
//    private List<Photo> likedPhotoList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

    
    
	
}
