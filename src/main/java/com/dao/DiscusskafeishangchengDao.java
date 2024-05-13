package com.dao;

import com.entity.DiscusskafeishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskafeishangchengVO;
import com.entity.view.DiscusskafeishangchengView;


/**
 * 咖啡商城评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface DiscusskafeishangchengDao extends BaseMapper<DiscusskafeishangchengEntity> {
	
	List<DiscusskafeishangchengVO> selectListVO(@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);
	
	DiscusskafeishangchengVO selectVO(@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);
	
	List<DiscusskafeishangchengView> selectListView(@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);

	List<DiscusskafeishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);
	
	DiscusskafeishangchengView selectView(@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);
	
}
