package com.tuficha.tuficha.repository;

import com.tuficha.tuficha.domain.Third;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface QueryFilterRepository extends JpaRepository<Third,Long> {

    public List<Third> getData(HashMap<String,Object>conditions);
}
