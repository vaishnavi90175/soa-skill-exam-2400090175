package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Asset;
import com.klef.soa.exam.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetRepository repo;

    public Asset insertAsset(Asset asset) {
        return repo.save(asset);
    }

    public Asset updateAsset(Long id, Asset asset) {
        Asset old = repo.findById(id).orElse(null);

        if (old != null) {
            old.setName(asset.getName());
            old.setType(asset.getType());
            old.setStatus(asset.getStatus());
            old.setLocation(asset.getLocation());

            return repo.save(old);
        }

        return null;
    }

    public void deleteAsset(Long id) {
        repo.deleteById(id);
    }

    public List<Asset> getAllAssets() {
        return repo.findAll();
    }

    public Asset getAssetById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Asset> findByName(String name) {
        return repo.findByName(name);
    }

    public List<Asset> findByType(String type) {
        return repo.findByType(type);
    }
}