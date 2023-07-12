package com.keycode.productrecommendationservice.service;

import com.keycode.productrecommendationservice.model.Recommendation;

import java.util.List;

public interface IRecommendationService {
    Recommendation getRecommendationById(Long recommendationId);
    Recommendation saveRecommendation(Recommendation recommendation);
    List<Recommendation> getAllRecommendationByProductName(String productName);
    void deleteRecommendation(Long id);
}
