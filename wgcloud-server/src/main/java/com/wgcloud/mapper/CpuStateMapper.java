package com.wgcloud.mapper;

import com.wgcloud.entity.CpuState;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CpuStateMapper {


    public List<CpuState> selectAllByParams(Map<String, Object> map) throws Exception;

    public List<CpuState> selectByParams(Map<String, Object> params) throws Exception;

    public CpuState selectById(String id) throws Exception;

    public int selectByParamsCount(Map<String, Object> map);

    public void save(CpuState CpuState) throws Exception;

    public void insertList(List<CpuState> recordList) throws Exception;

    public int deleteByAccountAndDate(Map<String, Object> map) throws Exception;

    public int deleteById(String[] id) throws Exception;

}
