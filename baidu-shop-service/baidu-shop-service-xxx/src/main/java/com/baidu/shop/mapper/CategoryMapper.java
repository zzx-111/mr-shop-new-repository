package com.baidu.shop.mapper;

import com.baidu.shop.entity.CategoryEntity;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 2 * @ClassName CategoryMapper
 * 3 * @Description: TODO
 * 4 * @Author zzx
 * 5 * @Date 2021/1/20
 * 6 * @Version V1.0
 * 7
 **/
public interface CategoryMapper extends Mapper<CategoryEntity> {
    @Select(value = "select id,name from tb_category where id in (select category_id from tb_category_brand where brand_id=#{brandId})")
    List<CategoryEntity> getBrandByBrandId(Integer brandId);

}
