package com.wgcloud.mapper;

import com.wgcloud.entity.AppInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AppInfoMapper {

    public List<AppInfo> selectAllByParams(Map<String, Object> map) throws Exception;

    public List<AppInfo> selectByParams(Map<String, Object> params) throws Exception;

    public AppInfo selectById(String id) throws Exception;

    public List<AppInfo> selectByAccountId(String accountId) throws Exception;

    public void save(AppInfo AppInfo) throws Exception;

    public void insertList(List<AppInfo> recordList) throws Exception;

    public void updateList(List<AppInfo> recordList) throws Exception;

    public int deleteById(String[] id) throws Exception;

    public int deleteByHostName(Map<String, Object> map) throws Exception;

    public int deleteByDate(Map<String, Object> map) throws Exception;

    public int countByParams(Map<String, Object> params) throws Exception;

    public int updateById(AppInfo AppInfo) throws Exception;
}
