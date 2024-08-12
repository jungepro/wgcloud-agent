package com.wgcloud.mapper;

import com.wgcloud.entity.NetIoState;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NetIoStateMapper {


    public List<NetIoState> selectAllByParams(Map<String, Object> map) throws Exception;


    public List<NetIoState> selectByParams(Map<String, Object> params);


    public NetIoState selectById(String id) throws Exception;


    public void save(NetIoState NetIoState) throws Exception;


    public void insertList(List<NetIoState> recordList) throws Exception;

    public int deleteByAccountAndDate(Map<String, Object> map) throws Exception;

    public int deleteById(String[] id) throws Exception;


}
