package com.example.mapper.account;

import com.example.pojo.account.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 应付冲款mapper
 */
@Mapper
public interface AccountsPayableMapper {
    public List<Test> selTest();
}
