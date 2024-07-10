package org.jsp.Insert;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;

@Entity
@NamedQueries({
@NamedQuery(name = "details", query = "select u from User u"),
@NamedQuery(name="phoneno", query = "select u.name from User u where u.name=?1"),
@NamedQuery(name = "findname",query = "select u.phno from User u")
})

@NamedNativeQueries({
	@NamedNativeQuery(name = "detailsUser", query = "select * from User",resultClass = User.class),
	@NamedNativeQuery(name = "findbyname", query = "select * from User where name=:name",resultSetMapping = "UserMapping")
})




@SqlResultSetMapping(name = "UserMapping",
entities = @EntityResult(entityClass = User.class,
fields = {
		@FieldResult(name = "id",column = "id"),
		@FieldResult(name = "name",column = "name"),
		@FieldResult(name = "email",column = "email"),
		@FieldResult(name = "phno",column = "phno"),
		@FieldResult(name = "password",column = "password"),
		
		
}))

public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phno;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", password=" + password
				+ "]";
	}
	
	
	
	

}
