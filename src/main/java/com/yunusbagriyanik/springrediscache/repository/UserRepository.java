package com.yunusbagriyanik.springrediscache.repository;

import com.yunusbagriyanik.springrediscache.model.Membership;
import com.yunusbagriyanik.springrediscache.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByMembership(Membership membership);
}
