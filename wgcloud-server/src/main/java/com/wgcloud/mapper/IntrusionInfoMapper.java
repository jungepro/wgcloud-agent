package com.wgcloud.mapper;

import com.wgcloud.entity.IntrusionInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface IntrusionInfoMapper {


    public List<IntrusionInfo> selectAllByParams(Map<String, Object> map) throws Exception;


    public List<IntrusionInfo> selectByAccountId(String accountId) throws Exception;


    public List<IntrusionInfo> selectByParams(Map<String, Object> params) throws Exception;


    public IntrusionInfo selectById(String id) throws Exception;


    public void save(IntrusionInfo IntrusionInfo) throws Exception;

    public void insertList(List<IntrusionInfo> recordList) throws Exception;

    public int deleteById(String[] id) throws Exception;

    public int deleteByAccountAndDate(Map<String, Object> map) throws Exception;

    public int deleteByAccHname(Map<String, Object> map) throws Exception;


}
