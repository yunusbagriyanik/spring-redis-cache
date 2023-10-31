package com.yunusbagriyanik.springrediscache.service;

import com.yunusbagriyanik.springrediscache.model.Membership;
import com.yunusbagriyanik.springrediscache.model.User;
import com.yunusbagriyanik.springrediscache.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RedisCacheService {
    private final UserRepository userRepository;

    @Cacheable(value = "findUsersByMembershipLevel_CACHE", key = "'cacheKey_' + #membership.level")
    public List<User> findUsersByMembershipLevel(Membership membership) {
        return userRepository.findByMembership(membership);
    }

    @CacheEvict(value = "findUsersByMembershipLevel_CACHE", key = "'cacheKey_' + #user.membership.level")
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Cacheable(value = "findUsers_CACHE", key = "'cacheKey_' + 'ALL_USERS'")
    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
