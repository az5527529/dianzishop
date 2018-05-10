package com.phone.server.impl;

import java.util.List;


import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.phone.dao.NewsMapper;
import com.phone.entity.News;
import com.phone.server.NewsServer;
@Service
public class NewsServerImpi implements NewsServer {
    @Resource
    private NewsMapper ndao;
	@Override
	public int add(News po) {
		return ndao.insert(po);
	}

	@Override
	public int update(News po) {
		return ndao.updateByPrimaryKeySelective(po);
	}

	@Override
	public int delete(int id) {
		return ndao.deleteByPrimaryKey(id);
	}

	@Override
	public List<News> getAll(Map<String, Object> map) {
		return ndao.getAll(map);
	}

	@Override
	public News checkUname(String account) {
		return null;
	}

	@Override
	public List<News> getByPage(Map<String, Object> map) {
		return ndao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return ndao.getCount(map);
	}

	@Override
	public List<News> select(Map<String, Object> map) {
		return ndao.select(map);
	}

	@Override
	public News getById(int id) {
		return ndao.selectByPrimaryKey(id);
	}

	

}
