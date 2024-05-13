package com.dao;

import com.entity.KafeishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KafeishangchengVO;
import com.entity.view.KafeishangchengView;


/**
 * 咖啡商城
 * 
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface KafeishangchengDao extends BaseMapper<KafeishangchengEntity> {
	
	List<KafeishangchengVO> selectListVO(@Param("ew") Wrapper<KafeishangchengEntity> wrapper);
	
	KafeishangchengVO selectVO(@Param("ew") Wrapper<KafeishangchengEntity> wrapper);
	
	List<KafeishangchengView> selectListView(@Param("ew") Wrapper<KafeishangchengEntity> wrapper);

	List<KafeishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<KafeishangchengEntity> wrapper);
	
	KafeishangchengView selectView(@Param("ew") Wrapper<KafeishangchengEntity> wrapper);
	
}
