package co.edu.uniquindio.comandera.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniquindio.comandera.repostories.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
}
