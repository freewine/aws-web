package me.freewine.aws.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import me.freewine.aws.web.entity.User;

@Mapper
public interface UserMapper {
    @Insert("replace into users(name, age, country) values(#{name},#{age},#{country})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    Long insert(User item);

    @Select("select * from users")
    List<User> selectAll();
}
