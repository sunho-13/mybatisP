package org.example.mybatisp.ICategory;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMybatisMapper {
    void insert(CategoryDto dto);

    void update(CategoryDto dto);

    void deleteById(Long id);

    CategoryDto findById(long id);

    CategoryDto findByName(String name);

    List<CategoryDto> findAll();

    List<CategoryDto> findAllByNameContains(SearchCategoryDto searchCategoryDto);
}
