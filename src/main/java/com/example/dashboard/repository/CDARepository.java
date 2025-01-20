package com.example.dashboard.repository;

import com.example.dashboard.entity.CDA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CDARepository extends JpaRepository<CDA, Date> {
    @Query(value = "SELECT * FROM ( SELECT * FROM cda ORDER BY cdadate DESC LIMIT :days ) AS test ORDER BY cdadate ASC;", nativeQuery = true)
    List<CDA> findCDALatestData(@Param("days") Integer days);
}
