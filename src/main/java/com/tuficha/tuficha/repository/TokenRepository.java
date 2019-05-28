package com.tuficha.tuficha.repository;

import com.tuficha.tuficha.dto.Row;
//import com.tuficha.tuficha.domain.RowSections;
import com.tuficha.tuficha.domain.Token;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TokenRepository extends CrudRepository<Token,Long> {

    @Query("SELECT new com.tuficha.tuficha.dto.Row( thi.id, thi.name, thi.identification, thi.phone, thi.rh, pro.name, " +
            " af1.name, af2.name, sec.name, cit.name ) " +
            "FROM Token tok " +
            "join Third thi on (tok.id_third = thi.id) " +
            "join Affiliation af1 on (thi.id_eps = af1.id) " +
            "join Affiliation af2 on (thi.id_arl = af2.id) " +
            "join Profile pro on (thi.id_profile = pro.id) " +
            "join Section sec on (thi.id_section = sec.id) " +
            "join City cit on (sec.id_city = cit.id) ")
    List<Row> getRows();

    @Query("SELECT new com.tuficha.tuficha.dto.Row( thi.id, thi.name, thi.identification, thi.phone, thi.rh, pro.name, " +
            " af1.name, af2.name, sec.name, cit.name ) " +
            "FROM Third thi " +
            "join Affiliation af1 on (thi.id_eps = af1.id) " +
            "join Affiliation af2 on (thi.id_arl = af2.id) " +
            "join Profile pro on (thi.id_profile = pro.id) " +
            "join Section sec on (thi.id_section = sec.id) " +
            "join City cit on (sec.id_city = cit.id) ")
    List<Row> getThirds();

}
