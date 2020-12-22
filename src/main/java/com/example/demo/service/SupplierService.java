package com.example.demo.service;
import com.example.demo.respository.SupplierRepository;
import com.example.demo.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.co.SupplierCO;
import java.util.List;
import java.util.Optional;
@Service
public class SupplierService {
    @Autowired
    private SupplierService supplierService;


    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }


    public Supplier save(SupplierCO supplierCO) {



     return   supplierRepository.save(supplierCO.getSupplier());

    }

    public Optional<Supplier> get(Long id) {
        return supplierRepository.findById(id);
    }

    public List<Supplier> list() {
        return supplierRepository.findAll();
    }
}