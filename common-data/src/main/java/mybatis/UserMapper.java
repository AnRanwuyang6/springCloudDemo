package mybatis;

import entity.User;
import entity.UserExample;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
    int countByExample(UserExample example);
}