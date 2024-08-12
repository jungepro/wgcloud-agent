package com.wgcloud.mapper;

import com.wgcloud.entity.DbInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface DbInfoMapper {

    public List<DbInfo> selectAllByParams(Map<String, Object> map) throws Exception;

    public List<DbInfo> selectByParams(Map<String, Object> params) throws Exception;

    public DbInfo selectById(String id) throws Exception;

    public void save(DbInfo DbInfo) throws Exception;

    public int deleteById(String[] id) throws Exception;

    public int countByParams(Map<String, Object> params) throws Exception;

    public int updateById(DbInfo DbInfo) throws Exception;
}
