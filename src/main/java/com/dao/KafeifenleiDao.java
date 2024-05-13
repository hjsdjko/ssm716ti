package com.dao;

import com.entity.KafeifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KafeifenleiVO;
import com.entity.view.KafeifenleiView;


/**
 * 咖啡分类
 * 
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface KafeifenleiDao extends BaseMapper<KafeifenleiEntity> {
	
	List<KafeifenleiVO> selectListVO(@Param("ew") Wrapper<KafeifenleiEntity> wrapper);
	
	KafeifenleiVO selectVO(@Param("ew") Wrapper<KafeifenleiEntity> wrapper);
	
	List<KafeifenleiView> selectListView(@Param("ew") Wrapper<KafeifenleiEntity> wrapper);

	List<KafeifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<KafeifenleiEntity> wrapper);
	
	KafeifenleiView selectView(@Param("ew") Wrapper<KafeifenleiEntity> wrapper);
	
}
