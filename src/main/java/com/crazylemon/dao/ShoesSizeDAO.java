package com.crazylemon.dao;

import com.crazylemon.entity.ShoesSize;
import com.crazylemon.entity.ShoesSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoesSizeDAO {
    long countByExample(ShoesSizeExample example);

    int deleteByExample(ShoesSizeExample example);

    int deleteByPrimaryKey(Integer shoesSizeId);

    int insert(ShoesSize record);

    int insertSelective(ShoesSize record);

    List<ShoesSize> selectByExample(ShoesSizeExample example);

    ShoesSize selectByPrimaryKey(Integer shoesSizeId);

    int updateByExampleSelective(@Param("record") ShoesSize record, @Param("example") ShoesSizeExample example);

    int updateByExample(@Param("record") ShoesSize record, @Param("example") ShoesSizeExample example);

    int updateByPrimaryKeySelective(ShoesSize record);

    int updateByPrimaryKey(ShoesSize record);
}