package com.wgcloud.mapper;

import com.wgcloud.entity.MemState;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MemStateMapper {


    public List<MemState> selectAllByParams(Map<String, Object> map) throws Exception;

    public List<MemState> selectByParams(Map<String, Object> params) throws Exception;

    public MemState selectById(String id) throws Exception;

    public void save(MemState MemState) throws Exception;

    public void insertList(List<MemState> recordList) throws Exception;

    public int deleteByAccountAndDate(Map<String, Object> map) throws Exception;

    public int deleteById(String[] id) throws Exception;


}
