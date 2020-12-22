package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Cataloge;

public interface CatalogRepository extends JpaRepository<Cataloge,String> {
}
