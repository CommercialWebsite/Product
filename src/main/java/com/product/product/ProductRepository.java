package com.product.product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    @Query("{$and: [ {$or : [ { null : ?0 } , { 'name' : ?0 }]}, {$or : [ { null : ?1 } , { 'brand' : ?1 }]}, {$or : [ { null : ?2 } , { typeId : ?2 }]} ] }")
    public List<ProductEntity> findByOptionalParameters(String name, String brand, String typeId);
    public List<ProductEntity> findAll();
    public ProductEntity findById(String id);
}