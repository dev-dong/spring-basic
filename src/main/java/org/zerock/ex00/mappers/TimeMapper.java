package org.zerock.ex00.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper {

    @Select("select now()")
    String getTime();

    String getTime2();
}
