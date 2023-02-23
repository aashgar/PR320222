/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author aashgar
 */
public class JpaMain {

    public static void main(String[] args) {
        EntityManager em = Persistence.
                createEntityManagerFactory("PR320222PU").createEntityManager();
//        Department department = new Department("Sales", "Gaza");
//        Project[] projects = {
//            new Project("SE", "Alquds"),
//            new Project("IT", "Rafah"),
//            new Project("SE", "Rafah")
//        };       
//        Employee employee1 = new Employee("Mostafa", 1001.1, department);
//        Employee employee2 = new Employee("Ahmad", 888.8, department);
//        employee1.setProjects(Arrays.asList(projects));
//        
//        em.getTransaction().begin();
//        em.persist(department);
//        em.persist(employee1);
//        em.persist(employee2);
//        em.getTransaction().commit();

//        Query query = em.createNamedQuery("Employee.findAll");
//        List<Employee> employees = query.getResultList();
//        for(Employee employee: employees)
//            System.out.println(employee.getName());
//        
//        Query query2 = em.createNamedQuery("Employee.findById");
//        Employee employee = (Employee) query2.setParameter("id",1).getSingleResult();
//        System.out.println(employee.getId());
        
        em.close();
    }
}
