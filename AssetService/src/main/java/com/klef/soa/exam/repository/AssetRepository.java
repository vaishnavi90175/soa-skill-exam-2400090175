package com.klef.soa.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    List<Asset> findByName(String name);

    List<Asset> findByType(String type);
}