package com.dao;

import com.entity.ShaishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShaishiView;

/**
 * 赛事信息 Dao 接口
 *
 * @author 
 */
public interface ShaishiDao extends BaseMapper<ShaishiEntity> {

   List<ShaishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
