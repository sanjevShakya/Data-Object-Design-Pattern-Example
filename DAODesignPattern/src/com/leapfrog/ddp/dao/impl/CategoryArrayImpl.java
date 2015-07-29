/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp.dao.impl;

import com.leapfrog.ddp.dao.CategoryDAO;
import com.leapfrog.ddp.entity.Category;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public class CategoryArrayImpl implements CategoryDAO{

    private List<Category> categoryList= new ArrayList<Category>(); //Generic Collection of objects
    @Override
    public int insert(Category c) {
        categoryList.add(c);
        System.out.println("Category added to array");
        return 1;
    }

    @Override
    public List<Category> getAll() {
        return categoryList;
        
    }
    
    
}
