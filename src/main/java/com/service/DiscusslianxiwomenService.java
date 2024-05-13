package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslianxiwomenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslianxiwomenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslianxiwomenView;


/**
 * 联系我们评论表
 *
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface DiscusslianxiwomenService extends IService<DiscusslianxiwomenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslianxiwomenVO> selectListVO(Wrapper<DiscusslianxiwomenEntity> wrapper);
   	
   	DiscusslianxiwomenVO selectVO(@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);
   	
   	List<DiscusslianxiwomenView> selectListView(Wrapper<DiscusslianxiwomenEntity> wrapper);
   	
   	DiscusslianxiwomenView selectView(@Param("ew") Wrapper<DiscusslianxiwomenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslianxiwomenEntity> wrapper);
   	
}

