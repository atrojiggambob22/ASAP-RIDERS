package com.asapRiders.user;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class RiderService 
{
	private final EntityManager entityManager;

	public RiderService(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}
	
	public void addRider(Riders rider)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(rider);
		entityManager.getTransaction().commit();
	}
	
	public Riders getRider(int id)
	{
		return entityManager.find(
				Riders.class, id);
	}
	
	 public Riders getRiderByUsername(String username) {
        String queryStr = "SELECT u FROM User u WHERE u.username = :username";

        TypedQuery<Riders> query = entityManager.createQuery(queryStr, Riders.class);
        query.setParameter("username", username);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void updateRider(int id, Riders rider) {
        Riders existingRider = getRider(id);

        if (existingRider == null) {
            throw new IllegalArgumentException(String.format("User with id %d does not exist", id));
        }

        existingRider.setFirstName(rider.getFirstName());
        existingRider.setLastName(rider.getLastName());
        existingRider.setEmail(rider.getEmail());
        existingRider.setPassword(rider.getPassword());

        entityManager.getTransaction().begin();
        entityManager.merge(existingRider);
        entityManager.getTransaction().commit();
    }
}