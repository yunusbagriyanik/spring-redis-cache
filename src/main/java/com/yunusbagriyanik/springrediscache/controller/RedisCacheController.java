package com.yunusbagriyanik.springrediscache.controller;

import com.yunusbagriyanik.springrediscache.model.Membership;
import com.yunusbagriyanik.springrediscache.model.User;
import com.yunusbagriyanik.springrediscache.service.RedisCacheService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis-cache")
@RequiredArgsConstructor
@Slf4j
public class RedisCacheController {

    private final RedisCacheService redisCacheService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsersByMembership(@RequestParam("membership") Membership membership) {
        return ResponseEntity.ok(redisCacheService.findUsersByMembershipLevel(membership));
    }

    @GetMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(redisCacheService.saveUser(user));
    }
}
