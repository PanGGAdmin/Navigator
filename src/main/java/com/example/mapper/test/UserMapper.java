package com.example.mapper.test;

import com.example.pojo.test.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {
    @Select("SELECT * from user")
    public List<Test> select();
/*    @Select("SELECT * FROM user WHERE ID=#{id}")
    public Test byId(@Param("id") int id);
    public int updateTest(Test test);
    @Delete("delete from user where id=#{id}")
    public int delete(Integer id);
    public int addTest(Test test);*/
}
