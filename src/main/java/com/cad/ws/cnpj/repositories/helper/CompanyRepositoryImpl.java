package com.cad.ws.cnpj.repositories.helper;

import com.cad.ws.cnpj.models.Company;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class CompanyRepositoryImpl implements CompanyRepositoryQueries {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Company> filtrar(Company company) {
        CriteriaBuilder cb = manager.getCriteriaBuilder();
        CriteriaQuery<Company> cq = cb.createQuery(Company.class);
        Root<Company> companyRoot = cq.from(Company.class);

        if (company != null) {
            if (!company.getEmail().isEmpty()) {
                Predicate pred = cb.like(companyRoot.get("email"), "%" + company.getEmail() + "%");
                cq.where(pred);
            }
        }
        return manager.createQuery(cq).getResultList();
    }
}
