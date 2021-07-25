package com.radis.io.repository;
import com.radis.io.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.redis.core.RedisTemplate;
import java.util.List;

@Repository
public class UserRepository {

    public static final String HASH_KEY = "User";

    @Autowired
    private RedisTemplate template;

    public UserEntity save(UserEntity entity) {
        template.opsForHash().put(HASH_KEY, entity.getId(), entity);
        return entity;
    }

    public List<UserEntity> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    public UserEntity getById(long id) {
        return (UserEntity)template.opsForHash().get(HASH_KEY, id);
    }


}
