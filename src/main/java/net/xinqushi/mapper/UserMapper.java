package net.xinqushi.mapper;


import net.xinqushi.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from users where  id = #{userId}")
    User getUser(@Param("userId") int userId);
}
