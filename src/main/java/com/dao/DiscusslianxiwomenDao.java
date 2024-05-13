package com.dao;

import com.entity.DiscusslianxiwomenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslianxiwomenVO;
import com.entity.view.DiscusslianxiwomenView;


/**
 * 联系我们评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface DiscusslianxiwomenDao extends BaseMapper<DiscusslianxiwomenEntity> {
	
	List<DiscusslianxiwomenVO> selectListVO(@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);
	
	DiscusslianxiwomenVO selectVO(@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);
	
	List<DiscusslianxiwomenView> selectListView(@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);

	List<DiscusslianxiwomenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);
	
	DiscusslianxiwomenView selectView(@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);
	
}
