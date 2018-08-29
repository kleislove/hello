package com.crazylemon.dao;

import com.crazylemon.entity.ReceiveAddress;
import com.crazylemon.entity.ReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiveAddressDAO {
    long countByExample(ReceiveAddressExample example);

    int deleteByExample(ReceiveAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    List<ReceiveAddress> selectByExample(ReceiveAddressExample example);

    ReceiveAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") ReceiveAddress record, @Param("example") ReceiveAddressExample example);

    int updateByExample(@Param("record") ReceiveAddress record, @Param("example") ReceiveAddressExample example);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);
}