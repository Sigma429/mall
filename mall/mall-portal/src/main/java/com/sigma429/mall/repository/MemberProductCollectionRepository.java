package com.sigma429.mall.repository;

import com.sigma429.mall.domain.MemberProductCollection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 商品收藏Repository
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection, String> {
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);

    int deleteByMemberIdAndProductId(Long memberId, Long productId);

    Page<MemberProductCollection> findByMemberId(Long memberId, Pageable pageable);

    void deleteAllByMemberId(Long memberId);
}
