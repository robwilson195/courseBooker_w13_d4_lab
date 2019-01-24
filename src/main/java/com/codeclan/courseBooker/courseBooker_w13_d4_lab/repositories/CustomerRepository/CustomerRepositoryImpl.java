package com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CustomerRepository;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourseId(Long Id) {
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.add(Restrictions.eq("bookingsAlias.course.Id", Id));
            results = cr.list();
            }
            catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Customer> findCustomersByCustomerTownAndCourseId(String town, Long Id) {
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.eq("bookingsAlias.course.Id", Id));
            results = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Customer> findCustomersByCustomerTownAndCourseIdAndOverAge(String town, Long Id, int age) {
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.gt("age", age));
            cr.add(Restrictions.eq("bookingsAlias.course.Id", Id));
            results = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
