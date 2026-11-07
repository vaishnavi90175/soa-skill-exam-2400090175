
package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.Asset;
import com.klef.soa.exam.service.AssetService;

@RestController
@RequestMapping("/assets")
public class AssetController {

    @Autowired
    private AssetService service;

   
    @GetMapping("/")
    public String home() {
        return "Asset Service is Working!";
    }

 
    @PostMapping("/add")
    public Asset insert(@RequestBody Asset asset) {
        return service.insertAsset(asset);
    }

   
    @PutMapping("/update/{id}")
    public Asset update(@PathVariable Long id,
                        @RequestBody Asset asset) {
        return service.updateAsset(id, asset);
    }

   
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteAsset(id);
        return "Asset Deleted Successfully";
    }

  
    @GetMapping("/display")
    public List<Asset> displayAll() {
        return service.getAllAssets();
    }

    
    @GetMapping("/display/{id}")
    public Asset displayById(@PathVariable Long id) {
        return service.getAssetById(id);
    }

   
    @GetMapping("/findByName/{name}")
    public List<Asset> findByName(@PathVariable String name) {
        return service.findByName(name);
    }

   
    @GetMapping("/findByType/{type}")
    public List<Asset> findByType(@PathVariable String type) {
        return service.findByType(type);
    }
}
