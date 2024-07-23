package org.example.mybatisp.ICategory;

import java.util.List;

public interface CategoryMybatisMapper {
    void insert(CategoryDto dto);

    CategoryDto findById(long id);

    CategoryDto findByName(String name);

    List<CategoryDto> findAll();

    void deleteById(Long id);

    void update(CategoryDto dto);

    List<CategoryDto> findAllByNameContains(String name);
}
