package com.docmind.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.docmind.backend.entity.KnowledgeBase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KnowledgeBaseMapper
        extends BaseMapper<KnowledgeBase>{
}
