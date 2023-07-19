package com.keycode.productrecommendationservice.repository;

import com.keycode.productrecommendationservice.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    @Query("select r FROM Recommendation r WHERE r.product.productName = :productName")
    public List<Recommendation> findAllRatingByProductName(@Param("productName") String productName);
}
