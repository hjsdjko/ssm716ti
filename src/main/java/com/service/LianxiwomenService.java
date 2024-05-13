package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LianxiwomenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LianxiwomenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LianxiwomenView;


/**
 * 联系我们
 *
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface LianxiwomenService extends IService<LianxiwomenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LianxiwomenVO> selectListVO(Wrapper<LianxiwomenEntity> wrapper);
   	
   	LianxiwomenVO selectVO(@Param("ew") Wrapper<LianxiwomenEntity> wrapper);
   	
   	List<LianxiwomenView> selectListView(Wrapper<LianxiwomenEntity> wrapper);
   	
   	LianxiwomenView selectView(@Param("ew") Wrapper<LianxiwomenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LianxiwomenEntity> wrapper);
   	
}

