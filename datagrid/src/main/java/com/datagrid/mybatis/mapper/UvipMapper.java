package com.datagrid.mybatis.mapper;

import com.datagrid.pojo.Uvip;
import com.datagrid.pojo.UvipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UvipMapper {
    int countByExample(UvipExample example);

    int deleteByExample(UvipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Uvip record);

    int insertSelective(Uvip record);

    List<Uvip> selectByExample(UvipExample example);

    Uvip selectByPrimaryKey(Integer id);
    
    List<Uvip> findAll();

    int updateByExampleSelective(@Param("record") Uvip record, @Param("example") UvipExample example);

    int updateByExample(@Param("record") Uvip record, @Param("example") UvipExample example);

    int updateByPrimaryKeySelective(Uvip record);

    int updateByPrimaryKey(Uvip record);

	List<Uvip> findByPage(Integer page, Integer limit);
}