package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.Asset;

public interface AssetService {

    Asset insertAsset(Asset asset);

    Asset updateAsset(Long id, Asset asset);

    void deleteAsset(Long id);

    List<Asset> getAllAssets();

    Asset getAssetById(Long id);

    List<Asset> findByName(String name);

    List<Asset> findByType(String type);
}