package com.fu.gmall.user.service.impl;

import com.fu.gmall.user.bean.UmsMember;
import com.fu.gmall.user.bean.UmsMemberReceiveAddress;
import com.fu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.fu.gmall.user.mapper.UserMapper;
import com.fu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
//        UmsMemberExample.Criteria criteria = umsMemberExample.createCriteria();
//        criteria.andPhoneEqualTo("18061581847");
//        UmsMemberExample.Criteria or = umsMemberExample.or();
//        //or.andUsernameEqualTo("test");
//        or.andNicknameEqualTo("windy");
//
//        List<UmsMember> umsMembers = umsMemberMapper.selectByExample(umsMemberExample);
//        return umsMembers;

        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;

    }

    @Override
    public List<UmsMember> getAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(Long.valueOf(memberId));
        List list = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return list;
    }

}
