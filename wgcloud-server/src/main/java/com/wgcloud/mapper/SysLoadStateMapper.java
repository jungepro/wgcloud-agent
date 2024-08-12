package com.wgcloud.mapper;

import com.wgcloud.entity.SysLoadState;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface SysLoadStateMapper {


    public List<SysLoadState> selectAllByParams(Map<String, Object> map) throws Exception;


    public List<SysLoadState> selectByParams(Map<String, Object> params) throws Exception;


    public SysLoadState selectById(String id) throws Exception;

    public void save(SysLoadState SysLoadState) throws Exception;


    public void insertList(List<SysLoadState> recordList) throws Exception;

    public int deleteByAccountAndDate(Map<String, Object> map) throws Exception;

    public int deleteById(String[] id) throws Exception;


}
