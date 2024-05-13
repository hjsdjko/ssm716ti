package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskafeishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskafeishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskafeishangchengView;


/**
 * 咖啡商城评论表
 *
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface DiscusskafeishangchengService extends IService<DiscusskafeishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskafeishangchengVO> selectListVO(Wrapper<DiscusskafeishangchengEntity> wrapper);
   	
   	DiscusskafeishangchengVO selectVO(@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);
   	
   	List<DiscusskafeishangchengView> selectListView(Wrapper<DiscusskafeishangchengEntity> wrapper);
   	
   	DiscusskafeishangchengView selectView(@Param("ew") Wrapper<DiscusskafeishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskafeishangchengEntity> wrapper);
   	
}

