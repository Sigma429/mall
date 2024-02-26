package com.sigma429.mall.repository;

import com.sigma429.mall.domain.MemberReadHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员商品浏览历史Repository
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    /**
     * 根据会员id按时间倒序获取浏览记录
     */
    Page<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId, Pageable pageable);

    void deleteAllByMemberId(Long memberId);
}
