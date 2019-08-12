package com.lan.tmall.dao;

import com.lan.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Xiang Lan
 * Created on 2019-08-11 22:34
 */


public interface CategoryDAO extends JpaRepository<Category, Integer> {


}
