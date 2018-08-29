package com.crazylemon.dao;

import com.crazylemon.entity.OrderDetail;
import com.crazylemon.entity.OrderDetailExample;
import com.crazylemon.entity.OrderDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailDAO {
    long countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);

    int deleteByPrimaryKey(OrderDetailKey key);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}