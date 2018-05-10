package com.phone.dao;

import java.util.List;
import java.util.Map;

import com.phone.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer ggid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer ggid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
    
    public News checkUname(Map<String, Object> uname);
//  查询所有信息
  public List<News> getAll(Map<String, Object> map);
//  获取条数
  public int getCount(Map<String, Object> po); 
//  分页
  public List<News> getByPage(Map<String, Object> map);
//  模糊查询并分页
  public List<News> select(Map<String, Object> map);
}