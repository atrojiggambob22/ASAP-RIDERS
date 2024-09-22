package com.asap.user;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class UserService 
{
	private final EntityManager entityManager;

	public UserService(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}
	
	public void addUser(User user)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
	}
	
	public User getUser(int id)
	{
		return entityManager.find(
				User.class, id);
	}
	
	 public User getUserByUsername(String username) {
        String queryStr = "SELECT u FROM User u WHERE u.username = :username";

        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("username", username);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void updateUser(int id, User user) {
        User existingUser = getUser(id);

        if (existingUser == null) {
            throw new IllegalArgumentException(String.format("User with id %d does not exist", id));
        }

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());

        entityManager.getTransaction().begin();
        entityManager.merge(existingUser);
        entityManager.getTransaction().commit();
    }
}