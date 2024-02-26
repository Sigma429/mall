package com.sigma429.mall.repository;

import com.sigma429.mall.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员关注Repository
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention, String> {
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);

    int deleteByMemberIdAndBrandId(Long memberId, Long brandId);

    Page<MemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);

    void deleteAllByMemberId(Long memberId);
}
