package com.example.spring;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NameMapper {
    @Select("SELECT id, name FROM movies;")
    List<Name> findAll();
}