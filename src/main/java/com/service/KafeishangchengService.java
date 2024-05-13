package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KafeishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KafeishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KafeishangchengView;


/**
 * 咖啡商城
 *
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface KafeishangchengService extends IService<KafeishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KafeishangchengVO> selectListVO(Wrapper<KafeishangchengEntity> wrapper);
   	
   	KafeishangchengVO selectVO(@Param("ew") Wrapper<KafeishangchengEntity> wrapper);
   	
   	List<KafeishangchengView> selectListView(Wrapper<KafeishangchengEntity> wrapper);
   	
   	KafeishangchengView selectView(@Param("ew") Wrapper<KafeishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KafeishangchengEntity> wrapper);
   	
}

