package com.dao;

import com.entity.LianxiwomenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LianxiwomenVO;
import com.entity.view.LianxiwomenView;


/**
 * 联系我们
 * 
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface LianxiwomenDao extends BaseMapper<LianxiwomenEntity> {
	
	List<LianxiwomenVO> selectListVO(@Param("ew") Wrapper<LianxiwomenEntity> wrapper);
	
	LianxiwomenVO selectVO(@Param("ew") Wrapper<LianxiwomenEntity> wrapper);
	
	List<LianxiwomenView> selectListView(@Param("ew") Wrapper<LianxiwomenEntity> wrapper);

	List<LianxiwomenView> selectListView(Pagination page,@Param("ew") Wrapper<LianxiwomenEntity> wrapper);
	
	LianxiwomenView selectView(@Param("ew") Wrapper<LianxiwomenEntity> wrapper);
	
}
