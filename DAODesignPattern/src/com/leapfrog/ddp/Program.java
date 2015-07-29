/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp;

import com.leapfrog.ddp.entity.Category;
import com.leapfrog.ddp.service.CategoryService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sanjeev
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategoryService categoryservice= new CategoryService();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String choice="y";
        while(choice.equalsIgnoreCase("y")){
            try{
            Category category = new Category();
            System.out.println("Enter id");
            category.setId(Integer.parseInt(reader.readLine()));
            System.out.println("Enter Category Name");
            category.setName(reader.readLine());
            categoryservice.insert(category);
            System.out.println("Do you want to continue");
            choice=reader.readLine();
            
            }catch(IOException ioe){
                
            }
            
        }
        
        //display all records
        
        for(Category c:categoryservice.getAll()){
            System.out.println(c.toString());
        }
    }
    
}
