package com.portpolio.www.process.member.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name="member")
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="m_seq")
	private Long mSeq;

	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	
	public Long getmSeq() {
		return mSeq;
	}

	public void setmSeq(Long mSeq) {
		this.mSeq = mSeq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public String toString() {
		return new ToStringBuilder(this).reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
