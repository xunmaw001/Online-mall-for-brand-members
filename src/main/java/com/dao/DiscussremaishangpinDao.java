package com.dao;

import com.entity.DiscussremaishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremaishangpinVO;
import com.entity.view.DiscussremaishangpinView;


/**
 * 热卖商品评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-26 18:05:33
 */
public interface DiscussremaishangpinDao extends BaseMapper<DiscussremaishangpinEntity> {
	
	List<DiscussremaishangpinVO> selectListVO(@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);
	
	DiscussremaishangpinVO selectVO(@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);
	
	List<DiscussremaishangpinView> selectListView(@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);

	List<DiscussremaishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);
	
	DiscussremaishangpinView selectView(@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);
	

}
