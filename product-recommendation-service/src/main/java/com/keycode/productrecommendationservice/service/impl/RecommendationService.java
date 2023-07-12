package com.keycode.productrecommendationservice.service.impl;

import com.keycode.productrecommendationservice.model.Recommendation;
import com.keycode.productrecommendationservice.repository.RecommendationRepository;
import com.keycode.productrecommendationservice.service.IRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService implements IRecommendationService {
    @Autowired
    private RecommendationRepository recommendationRepository;

    @Override
    public Recommendation saveRecommendation(Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    @Override
    public List<Recommendation> getAllRecommendationByProductName(String productName) {
        return recommendationRepository.findAllRatingByProductName(productName);
    }

    @Override
    public void deleteRecommendation(Long id) {
        recommendationRepository.deleteById(id);
    }

    @Override
    public Recommendation getRecommendationById(Long recommendationId) {
        return recommendationRepository.getOne(recommendationId);
    }
}
