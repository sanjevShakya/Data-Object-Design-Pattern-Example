/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp.service;

import com.leapfrog.ddp.dao.CategoryDAO;
import com.leapfrog.ddp.dao.impl.CategoryArrayImpl;

import com.leapfrog.ddp.dao.impl.CategoryDBImpl;
import com.leapfrog.ddp.entity.Category;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public class CategoryService {
    private CategoryDAO categoryDAO = new CategoryArrayImpl();
    
    public int insert(Category c)
    {
        return categoryDAO.insert(c);
    }
    
    public List<Category> getAll(){
        return categoryDAO.getAll();
    }

        
    }
    
