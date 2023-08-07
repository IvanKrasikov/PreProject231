package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserDAOImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery(
                        "select u from User u", User.class)
                .getResultList();
    }

    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    public void addUser(User user) {
        entityManager.persist(user);
    }

    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public void removeUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
