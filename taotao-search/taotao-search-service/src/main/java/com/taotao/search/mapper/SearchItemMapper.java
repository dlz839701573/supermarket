package com.taotao.search.mapper;

import java.util.List;

import com.taotao.common.pojo.SearchItem;

public interface SearchItemMapper {
	//查询所有
	public List<SearchItem> getSearchItemList();
	//根据id查询商品
	public SearchItem getSearchItemId(long itemId);
}
