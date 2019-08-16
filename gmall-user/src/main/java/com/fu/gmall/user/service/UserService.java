package com.fu.gmall.user.service;

import com.fu.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMember> getAddressByMemberId(String memberId);
}
