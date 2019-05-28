package com.tuficha.tuficha.repository.impl;

import com.tuficha.tuficha.domain.Third;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;


public class QueryFilterRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Third> getData(HashMap<String,Object>conditions){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Third> query= cb.createQuery(Third.class);
        Root<Third> root = query.from(Third.class);

        List<Predicate> predicates = new ArrayList<>();
        conditions.forEach((field,value) ->
        {
            switch (field)
            {
                case "identification":
                    predicates.add(cb.equal (root.get(field), (Integer)value));
                    break;
                case "name":
                    predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
                    break;
//                case "profile":
//                    predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
//                    break;
            }
        });
        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
        return entityManager.createQuery(query).getResultList();
    }
}
