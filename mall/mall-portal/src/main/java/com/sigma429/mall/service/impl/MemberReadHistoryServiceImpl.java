package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.MemberReadHistory;
import com.sigma429.mall.model.UmsMember;
import com.sigma429.mall.repository.MemberReadHistoryRepository;
import com.sigma429.mall.service.MemberReadHistoryService;
import com.sigma429.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName:MemberReadHistoryServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:26
 * @Version:v1.0
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;
    @Autowired
    private UmsMemberService memberService;

    @Override
    public int create(MemberReadHistory memberReadHistory) {
        UmsMember member = memberService.getCurrentMember();
        memberReadHistory.setMemberId(member.getId());
        memberReadHistory.setMemberNickname(member.getNickname());
        memberReadHistory.setMemberIcon(member.getIcon());
        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<MemberReadHistory> deleteList = new ArrayList<>();
        for (String id : ids) {
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            deleteList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public Page<MemberReadHistory> list(Integer pageNum, Integer pageSize) {
        UmsMember member = memberService.getCurrentMember();
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(member.getId(), pageable);
    }

    @Override
    public void clear() {
        UmsMember member = memberService.getCurrentMember();
        memberReadHistoryRepository.deleteAllByMemberId(member.getId());
    }
}
