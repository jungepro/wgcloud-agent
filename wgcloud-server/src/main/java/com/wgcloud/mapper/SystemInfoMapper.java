package com.wgcloud.mapper;

import com.wgcloud.entity.SystemInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface SystemInfoMapper {


    public List<SystemInfo> selectAllByParams(Map<String, Object> map) throws Exception;

    public List<SystemInfo> selectByAccountId(String accountId) throws Exception;

    public List<SystemInfo> selectByParams(Map<String, Object> params);

    public void insertList(List<SystemInfo> recordList) throws Exception;

    public void updateList(List<SystemInfo> recordList) throws Exception;

    public SystemInfo selectById(String id) throws Exception;

    public int updateById(SystemInfo SystemInfo) throws Exception;

    public int countByParams(Map<String, Object> params) throws Exception;

    public void save(SystemInfo SystemInfo) throws Exception;

    public int deleteById(String[] id) throws Exception;


    public int deleteByAccountAndDate(Map<String, Object> map) throws Exception;

    public int deleteByAccHname(Map<String, Object> map) throws Exception;


}
