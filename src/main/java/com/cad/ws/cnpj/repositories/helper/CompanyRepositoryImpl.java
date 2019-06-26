package com.cad.ws.cnpj.repositories.helper;

import com.cad.ws.cnpj.models.Client;
import com.cad.ws.cnpj.models.Company;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CompanyRepositoryImpl implements CompanyRepositoryQueries {

    @PersistenceContext
    private EntityManager manager;

    //@SuppressWarnings("unchecked")
    @Override
    //@Transactional(readOnly = true)
    public List<Company> filtrar(Company company) {
        Criteria criteria = manager.unwrap(Session.class).createCriteria(Client.class);

        if (company != null) {
            if (!StringUtils.isEmpty(company.getEmail())) {
                criteria.add(Restrictions.ilike("email", company.getEmail(), MatchMode.ANYWHERE));
            }
        }

        return criteria.list();
    }
}
