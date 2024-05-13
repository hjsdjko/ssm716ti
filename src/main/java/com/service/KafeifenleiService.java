package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KafeifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KafeifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KafeifenleiView;


/**
 * 咖啡分类
 *
 * @author 
 * @email 
 * @date 2021-03-09 12:43:16
 */
public interface KafeifenleiService extends IService<KafeifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KafeifenleiVO> selectListVO(Wrapper<KafeifenleiEntity> wrapper);
   	
   	KafeifenleiVO selectVO(@Param("ew") Wrapper<KafeifenleiEntity> wrapper);
   	
   	List<KafeifenleiView> selectListView(Wrapper<KafeifenleiEntity> wrapper);
   	
   	KafeifenleiView selectView(@Param("ew") Wrapper<KafeifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KafeifenleiEntity> wrapper);
   	
}

