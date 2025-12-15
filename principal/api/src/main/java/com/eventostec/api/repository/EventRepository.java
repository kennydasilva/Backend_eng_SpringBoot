package com.eventostec.api.repository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eventostec.api.domain.*;

@Repository
public interface EventRepository extends JpaRepository<Event, UUID>{


    @Query("SELECT e FROM Event e LEFT JOIN FETCH e.address a WHERE e.date>=:currentDate")
    public Page<Event> findUpcomingEvents(@Param("currentDate") LocalDateTime currentDate, Pageable pageable);

    @Query("""
        SELECT e
        FROM Event e
        LEFT JOIN e.address a
        WHERE (:title IS NULL OR e.title LIKE CONCAT('%', :title, '%'))
          AND (:city IS NULL OR a.city LIKE CONCAT('%', :city, '%'))
          AND (:uf IS NULL OR a.uf LIKE CONCAT('%', :uf, '%'))
          AND (:startDate IS NULL OR e.date >= :startDate)
          AND (:endDate IS NULL OR e.date <= :endDate)
        """)
    Page<Event> findFilteredEvents(
            @Param("title") String title,
            @Param("city") String city,
            @Param("uf") String uf,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate,
            Pageable pageable
    );
}
