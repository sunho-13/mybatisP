package org.example.mybatisp.ICategory;

import org.example.mybatisp.ICommonService;

import java.util.List;

public interface ICategoryService<T> extends ICommonService<T> {
    ICategory findByName(String name);
    List<ICategory> findAllByNameContains(SearchCategoryDto dto);
    int countAllByNameContains(SearchCategoryDto searchCategoryDto);
}
