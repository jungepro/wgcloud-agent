package com.wgcloud.mapper;

import com.wgcloud.entity.MailSet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MailSetMapper {


    public List<MailSet> selectAllByParams(Map<String, Object> map) throws Exception;

    public void save(MailSet MailSet) throws Exception;

    public int deleteById(String[] id) throws Exception;

    public int updateById(MailSet MailSet) throws Exception;


}
