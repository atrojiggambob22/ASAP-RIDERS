package com.asap.user;


import java.util.List;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name="users")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String firstname;
	
	@Column(nullable = false)
	private String lastname;
        
        @Column(nullable = false, unique = true)
	private String email;
	
        @Column(nullable = false)
	private String password;
        
        @Column(nullable = false, unique = true)
        private String username;
        
	public User()
	{
	}

	public User(String firstname, String lastname, String email,String username, String password )
	{
		this.firstname = firstname;
		this.lastname = lastname;
               this.email = email;
               this.username = username;
               this.password = password;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
        
        public String getFirstName()
	{
		return firstname;
	}

	public void setFirstName(String firstName)
	{
		this.firstname = firstName;
	}

	public String getLastName()
	{
		return lastname;
	}

	public void setLastName(String lastName)
	{
		this.lastname = lastName;
	}

        public String getEmail()
        {
            return email;
        }
        
        public void setEmail(String email)
        {
            this.email = email;
        }
        
        public String getUsername()
        {
            return username;
        }

        public void setUsername(String username)
        {
            this.username = username;
        }

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
        
	@Override
	public String toString()
	{
		return username;
	}
}
